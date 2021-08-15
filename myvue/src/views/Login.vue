<template>
  <div class="all">
    <section class="photo">
      <img src="../../../myvue/static/img/图片.png" alt="">
    </section>
    <div class="main"> 
      <header><h1>账户登录</h1></header>
      <div class="main_body">
        <div class="login_main">
            <div class="id">用户名：<el-input v-model="userid" placeholder="请输入内容"></el-input></div>
            <br />
            <div class="password">
              密　码：<el-input placeholder="请输入密码" v-model="userpassword" show-password></el-input>
            </div>
          </div>  
          <div class="choose_main">
            <el-radio v-model="looplist" label="Administrator">管理员</el-radio>
            <el-radio v-model="looplist" label="merchant">商家</el-radio>
          </div>
          <div class="button_main">
            <el-button type="primary" @click="userlogin">登入</el-button>
          </div>
      </div>
    </div>
  </div> 
</template>

<script>
import axios from 'axios'
import Qs from 'qs'

export default {
  data() {
    return {
      looplist: '',
      userid:'',
      userpassword:'',
    }
  },
  methods: {
    userlogin() {
      let _this = this
      if (_this.looplist.length == 0) {
        alert('请选择你的身份')
        return
      }
      if (_this.userid.length == 0) {
        alert('请输入账号')
      } else if (
        _this.userpassword.length == 0 ||
        _this.userid.length == 0
      ) {
        alert('账号或密码错误')
      } else {
        let data = {
          username: _this.userid,
          password: _this.userpassword,
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
            _this.$store.commit('login',{username:_this.userid,userpassword:_this.userpassword}),
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
.all{
  position: fixed;
  top:0px;
  left: 0px;
  right: 0px;
  bottom: 0px;
  background-image: url('../../../myvue/static/img/背景.png');
}
.photo img{
  position: fixed;
  position: fixed;
  top: 15%;
  right: 8%;
}
div {
  background-color: rgb(217, 232, 251);
}
header{
  text-align: center;
  padding: 30px 10px 0px 10px;
}
.main {
  border-style:groove;
  border:5px rgb(76, 118, 170) solid;
  position: fixed;
  top: 22.5%;
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
  padding: 30px;
  color: rgb(30, 100, 152);
}
.el-input{
  width: 80%;;
}
.choose_main{
  width: 90%;
  padding: 0px 40px 0px 40px;
  display: flex;
}
.choose_main .el-radio{
  flex: 1;
}
.button_main{
  margin: 30px;
  text-align: center;
}
.el-button{
  width: 50%;
}
</style>