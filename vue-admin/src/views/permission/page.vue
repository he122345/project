<template>
  <div class="app-container">
    Hi! <b style="color:blue">{{ username }}</b> ,Your role: <b style="color:blue">{{ roles }}</b>
  </div>
</template>
<script>

export default {
  name: 'PagePermission',
  computed: {
    roles() {
      return this.$store.getters.roles[0]
    },
    username() {
      return window.sessionStorage.getItem('username')
    }
  }
}
</script>
