<template>
  <div class="app-container">
    <el-button type="primary" @click="handleAddUser">New User</el-button>

    <el-table :data="usersList" style="width: 100%;margin-top:30px;" border>
      <el-table-column align="center" label="User name" width="220">
        <template slot-scope="scope">
          {{ scope.row.username }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="User password" width="220">
        <template slot-scope="scope">
          {{ scope.row.password }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="Role">
        <template slot-scope="scope">
          {{ scope.row.role }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="Operations">
        <template slot-scope="scope">
          <el-button type="primary" size="small" @click="handleEdit(scope)">Edit</el-button>
          <el-button type="danger" size="small" @click="handleDelete(scope)">Delete</el-button>
        </template>
      </el-table-column>
    </el-table>

    <el-dialog :visible.sync="dialogVisible" :title="dialogType==='edit'?'Edit User':'New User'">
      <el-form ref="user" :model="user" :rules="editRules" autocomplete="on" label-width="100px" label-position="left">
        <el-form-item label="Name" prop="username">
          <el-input ref="username" v-model="user.username" placeholder="User Name" :disabled="disabled" />
        </el-form-item>
        <el-form-item label="Password" prop="password">
          <el-input
            ref="password"
            v-model="user.password"
            placeholder="User Password"
          />
        </el-form-item>
        <el-form-item label="Role">
          <el-select v-model="user.role">
            <el-option
              v-for="item in roles"
              :key="item"
              :label="item"
              :value="item"
            />
          </el-select>
        </el-form-item>
      </el-form>
      <div style="text-align:right;">
        <el-button type="danger" @click="dialogVisible=false">Cancel</el-button>
        <el-button type="primary" @click="confirmUser">Confirm</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { deepClone } from '@/utils'
import { getUsers, getRoles, addUser, deleteUser, updateUser } from '@/api/change'

const defaultUser = {
  username: '',
  password: '',
  role: ''
}

export default {
  data() {
    const validateUsername = (rule, value, callback) => {
      if (value.length < 5) {
        callback(new Error("Username's length should greater than 4"))
      } else {
        callback()
      }
    }
    const validatePassword = (rule, value, callback) => {
      if (value.length < 6) {
        callback(new Error('The password can not be less than 6 character'))
      } else {
        callback()
      }
    }
    return {
      user: Object.assign({}, defaultUser),
      roles: [],
      usersList: [],
      dialogVisible: false,
      dialogType: 'new',
      checkStrictly: false,
      defaultProps: {
        children: 'children',
        label: 'title'
      },
      editRules: {
        username: [{ required: true, trigger: 'blur', validator: validateUsername }],
        password: [{ required: true, trigger: 'blur', validator: validatePassword }]
      },
      disabled: false
    }
  },
  computed: {
    UsersData() {
      return this.users
    }
  },
  created() {
    // Mock: get all users and roles list from server
    this.getUsers()
    this.getRoles()
  },
  methods: {
    async getUsers() {
      const res = await getUsers()
      this.usersList = res.data
    },
    async getRoles() {
      const res = await getRoles()
      const data = res.data
      console.log(data)
      data.forEach(element => {
        this.roles.push(element.name)
      })
    },
    handleAddUser() {
      this.user = Object.assign({}, defaultUser)
      this.dialogType = 'new'
      this.dialogVisible = true
      this.disabled = false
    },
    handleEdit(scope) {
      this.dialogType = 'edit'
      this.dialogVisible = true
      this.checkStrictly = true
      this.user = deepClone(scope.row)
      this.disabled = true
    },
    handleDelete({ $index, row }) {
      this.$confirm('Confirm to remove the role?', 'Warning', {
        confirmButtonText: 'Confirm',
        cancelButtonText: 'Cancel',
        type: 'warning'
      })
        .then(async() => {
          await deleteUser(row.key)
          this.usersList.splice($index, 1)
          this.$message({
            type: 'success',
            message: 'Delete succed!'
          })
        })
        .catch(err => { console.error(err) })
    },
    async confirmUser() {
      let flag = 1
      this.$refs.user.validate(valid => {
        if (!valid) {
          this.$message('Incorrectly data')
          flag = 0
        }
      })
      if (flag == 0) { return }
      const isEdit = this.dialogType === 'edit'
      if (isEdit) {
        await updateUser(this.user)
        for (let index = 0; index < this.usersList.length; index++) {
          if (this.usersList[index].username === this.user.username) {
            this.usersList.splice(index, 1, Object.assign({}, this.user))
            break
          }
        }
      } else {
        let flag = 0
        for (let index = 0; index < this.usersList.length; index++) {
          if (this.usersList[index].username === this.user.username) {
            flag = 1
            break
          }
        }
        if (flag == 0) {
          this.usersList.push(this.user)
        } else {
          this.$notify({
            title: 'Failed',
            dangerouslyUseHTMLString: true,
            message: `The username has existed`,
            type: 'fail'
          })
          return
        }
      }
      const { username, password, role } = this.user
      this.dialogVisible = false
      this.$notify({
        title: 'Success',
        dangerouslyUseHTMLString: true,
        message: `
            <div>User username: ${username}</div>
            <div>User password: ${password}</div>
            <div>User role: ${role}</div>
          `,
        type: 'success'
      })
    }
  }
}
</script>

<style lang="scss" scoped>
.app-container {
  .roles-table {
    margin-top: 30px;
  }
  .permission-tree {
    margin-bottom: 30px;
  }
}
</style>
