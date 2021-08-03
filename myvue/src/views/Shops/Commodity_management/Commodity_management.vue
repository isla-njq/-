<template>
    <div class="main">
        <Header></Header>
        <div class="a1"><Nav></Nav></div>
        
        <div class="a2">
            <router-view></router-view>
        </div>
        
    </div>
</template>

<script>
import Header from '../../../components/firm_background_header.vue'
import Nav from '../../../components/firm_background_nav.vue'
export default {
    data(){
        return{
            shopslist:[
                {
                    id:1,
                    name:'rog',
                    price:24000,
                    inventory:286,
                },{
                    id:2,
                    name:'rog',
                    price:24800,
                    inventory:287,
                }
            ]
        }
    },
    components:{
        Header,
        Nav
    },

}
</script>

<style scoped>
main{
    overflow: hidden;
}
.a1{
    position: fixed;
    left: 0px;
    top:155px
}
.a2{
    width: 85%;
    position: fixed;
    left:250px;
    top:155px
}
</style>