<template>
    <header>
        <div style="margin-right: 10%" @click="Logout">注销</div>
        <div style="margin-right: 5%">管理员用户名：{{$store.state.user}}</div>
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
}
header{
    background-image: url(../../static/img/Header.png);
    background-size:100% 100%;
    background-repeat:no-repeat;
    height: 90px;
}
div{
    font-size: 1rem;
    padding-top: 30px;
    color: white;
}
</style>