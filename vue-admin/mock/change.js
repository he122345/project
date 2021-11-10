
  const users=[
    {username:'user1',password:'111111',role:'admin'},
    {username:'user2',password:'111111',role:'editor'}
  ]
  
  module.exports = [
    // mock get all users
    {
      url: '/vue-element-admin/changes',
      type: 'get',
      response: _ => {
        return {
          code: 20000,
          data: users
        }
      }
    },
  
    // add user
    {
      url: '/vue-element-admin/change',
      type: 'post',
      response: {
        code: 20000,
        data:{
            status: 'success'
        }
      }
    },
  
    // update user
    {
      url: '/vue-element-admin/change',
      type: 'put',
      response: {
        code: 20000,
        data: {
          status: 'success'
        }
      }
    },
  
    // delete user
    {
      url: '/vue-element-admin/change/[A-Za-z0-9]',
      type: 'delete',
      response: {
        code: 20000,
        data: {
          status: 'success'
        }
      }
    }
  ]
  