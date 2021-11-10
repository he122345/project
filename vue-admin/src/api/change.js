import request from '@/utils/request'

export function getUsers() {
  return request({
    url: '/vue-element-admin/changes',
    method: 'get'
  })
}

export function getRoles() {
  return request({
    url: '/vue-element-admin/roles',
    method: 'get'
  })
}

export function addUser(data) {
  return request({
    url: '/vue-element-admin/change',
    method: 'post',
    data
  })
}

export function updateUser(data) {
  return request({
    url: `/vue-element-admin/change`,
    method: 'put',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: `/vue-element-admin/change/${id}`,
    method: 'delete'
  })
}
