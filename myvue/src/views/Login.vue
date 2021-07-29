<template>
  <div class="main">
    <div class="main_body">
      <div><h1>账户登录</h1></div>
      <div class="login_main">
        <form class="choose">
          <div>用户名：<input type="text" name="username" ref="userid" /></div>
          <br />
          <div>
            密　码：<input
              type="password"
              name="userpassword"
              ref="userpassword"
            />
          </div>
        </form>
        <form>
          <div id="adm">
            <input
              type="radio"
              name="usertype"
              value="Administrator"
              v-model="looplist"
            />管理员
          </div>
          <div id="mer">
            <input
              type="radio"
              name="usertype"
              value="merchant"
              v-model="looplist"
            />商家
          </div>
        </form>
        <button @click="userlogin">登录</button>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import router from 'vue-router'

import Qs from 'qs'

export default {
  data() {
    return {
      looplist: '',
    }
  },
  methods: {
    userlogin() {
      let _this = this
      if (_this.looplist.length == 0) {
        alert('请选择你的身份')
        return
      }
      if (_this.$refs.userid.value.length == 0) {
        alert('请输入账号')
      } else if (
        _this.$refs.userpassword.value.length == 0 ||
        _this.$refs.userid.value.length == 0
      ) {
        alert('账号或密码错误')
      } else {
        let data = {
          username: _this.$refs.userid.value,
          password: _this.$refs.userpassword.value,
        }
        axios({
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
          },
          method: 'post',
          url: 'http://localhost:8080/admin/login_admin',
          data: Qs.stringify(data),
        }).then(function (response) {
          if (response.data.status == false) {
            alert(response.data.message)
          } else {
            _this.$store.commit('login',{username:_this.$refs.userid.value,userpassword:_this.$refs.userpassword.value}),
            alert(_this.$store.state.user),
            _this.$router.push({
              path: '/Personal_center',
            })
          }
          console.log(1111, response.data)
        })
      }
    },
  },
}
</script>

<style scoped>
div {
  background-color: rgb(217, 232, 251);
}
.main {
  position: fixed;
  top: 20%;
  right: 20%;
  width: 500px;
  height: 400px;
}
.main_body {
  width: 80%;
  margin: auto;
  overflow: hidden;
}
.login_main {
  width: 42%;
  padding: 30px;
  color: rgb(30, 100, 152);
}
.login_main input {
  border-radius: 0.2rem;
  border-width: 1px;
  border-style: solid;
  border-color: rgb(171, 171, 171);
}
.login_main form {
  width: 250px;
}
.choose div input {
  width: 70%;
}
.choose div {
  margin-bottom: 15px;
}
form {
  overflow: hidden;
}
#adm {
  width: 48%;
  float: left;
  border-right: solid black 1px;
}
#mer {
  width: 48%;
  float: right;
}
button {
  margin: 10%;
  width: 100%;
  height: 30px;
  background-color: rgb(0, 108, 175);
  color: white;
  border-radius: 0.3rem;
  border-width: 0px;
}
</style>