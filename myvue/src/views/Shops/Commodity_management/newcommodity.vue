<template>
    <div>
        <Header></Header>
        <section>
        </section>
        <section class="main">
            <h1>商品列表>添加商品</h1>
            <div>
                <div>商品名称</div>
            </div>
        </section>
    </div>
</template>

<script>
import Header from '../../../components/firm_background_header.vue'

export default {
    data(){
        return{

        }
    },
    components:{
        Header
    }
}
</script>

<style scoped>
section{
    float: left;
}
.main div{
    margin: 30px 0px 0px 20px;
    padding: 10px 0px 0px 40px ;
    background-color: rgb(244, 246, 250);
}
</style>