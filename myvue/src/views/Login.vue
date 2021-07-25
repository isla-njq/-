<template>
    <div class="main">
        <div><h1>账户登录</h1></div>
        <div class="login_main">
            <form>
                用户名：<input type="text" name="username" ref="userid"/></br>
                密　码：<input type="password" name="userpassword" ref="userpassword"/>
            </form>
            <form>
                <input type="radio" name="usertype" value="Administrator" v-model="looplist"/>管理员
                <input type="radio" name="usertype" value="merchant" v-model="looplist"/>商家
            </form>
            <button @click="userlogin">登录</button>
        </div>
    </div>
</template>

<script>
import axios from 'axios'

import Qs from 'qs'


export default {
    data(){
        return{
            looplist:""
        }
    },
    methods:{
            userlogin(){
                if(this.$refs.userid.value.length == 0){
                    alert("请输入账号")
                }else if(this.$refs.userpassword.value.length==0||this.$refs.userid.value.length == 0){
                    alert("账号或密码错误")
                };
                console.log(this.looplist,this.$refs.userid.value.length,this.$refs.userpassword.value.length);
                let data = {
                    username: this.$refs.userid.value,
                    password: this.$refs.userpassword.value,
                };                
                axios({
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded'
                    },
                    method: 'post',
                    url: 'http://localhost:8080/admin/login_admin',
                    data: Qs.stringify(data)
                }).then(function (response) {
                    if(response.data.status == false){
                        alert(response.data.message)
                    }
                    console.log(1111,response.data);
                });

            }
        }
}
</script>

<style scoped>
div{
    background-color: rgb(217, 232, 251);
}
.login_main{
    padding: 30px;
    color: rgb(30, 100, 152);
}
</style>