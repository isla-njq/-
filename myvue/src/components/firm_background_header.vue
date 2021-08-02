<template>
    <header>
        <div @click="Logout">注销</div>
        <div>管理员用户名：{{$store.state.user}}</div>
    </header>
</template>

<script>
export default {
    data(){
        return{

        }
    },
    methods:{
        Logout(){
            alert('注销成功'),
            this.$store.commit('logout')
        }
    }
}
</script>

<style scoped>
header div{
    float: right;
    margin-right: 50px;
}
header{
    background-image: url(../../static/img/Header.png);
    background-size:1920px 150px;
    background-repeat:no-repeat;
    padding: 30px;
    height: 90px;
}
div{
    font-size: 20px;
    padding-top:25px ;
    color: white;
}
</style>