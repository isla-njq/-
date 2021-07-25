<template>
    <div>
        <div>账户登录</div>
        <form>
            用户名:<input type="text" name="username" ref="userid"/>
            密码:<input type="password" name="userpassword" ref="userpassword"/>
        </form>
        <form>
            <input type="radio" name="usertype" value="Administrator" v-model="looplist"/>管理员
            <input type="radio" name="usertype" value="merchant" v-model="looplist"/>商家
        </form>
        <button @click="userlogin">登录</button>
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
    methods: {
            userlogin(){

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
