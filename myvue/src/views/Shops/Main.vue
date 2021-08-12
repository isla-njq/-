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
.header{
    width: 100%;
}

.div1{
    position: absolute;
    left: 0px;
    top: 150px;
    right: -17px;
    bottom: 0px;
    overflow-y:auto;
    overflow-x: hidden;
    background-color: #304156;
    width: 219px;
    padding-right: 20px;
}
.div2{
    margin-left: 213px;
    z-index: 1001;
    max-height: 1030px;
    overflow: hidden;
}
</style>