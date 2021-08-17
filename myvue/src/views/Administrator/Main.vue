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
import Nav from '../../components/Administrator_nav.vue'
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
.header{
    width: 100%;
    z-index: 1001;
}

.div1{
    position: absolute;
    left: 0px;
    top: 90px;
    bottom: 0px;
    width: 200px;
    overflow-x: hidden;
    overflow-y: scroll;
    background-color: #304156;
    box-sizing: content-box;
    padding-right: 20px;
}
.div2{
    position: absolute;
    left: 180px;
    right: 0px;
    top:90px;
    bottom: 0px;
    background-color: rgb(244, 246, 250);
    z-index: 1001;
}
</style>