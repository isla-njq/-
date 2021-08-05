<template>
    <div class="main">
        <Header class="header"></Header>
        <div class="div1"><Nav></Nav></div>
        <div class="div2">
            <router-view></router-view>
        </div>
    </div>
</template>

<script>
import Header from '../../components/firm_background_header.vue'
import Nav from '../../components/firm_background_nav.vue'
export default {
    components:{
        Header,
        Nav
    },

}
</script>

<style scoped>
.main{
    overflow: hidden;
}
.div1{
    float: left;
}
.div2{
    float: left;
    width: 80%;
}
</style>