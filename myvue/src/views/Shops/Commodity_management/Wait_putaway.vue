<template>
    <div>
        <Header></Header>
        <section>
            <ul>
                <li>商品列表</li>
                <ul>
                    <li>待上架</li>
                    <li>已发布</li>
                    <li>已下架</li>
                    <li>已售罄</li>
                </ul>
                <li>订单列表</li>
                <li>发票管理</li>
                <li>数据统计</li>
                <li>账号管理</li>
                <li>资金统计</li>
            </ul>
        </section>
        <section class="main">
            <h1>账号管理</h1>
            <div>
                <table border="0">
                    <tr>
                        <th>商品名称</th>
                        <th>价格</th>
                        <th>库存</th>
                        <th>操作</th>
                    </tr>
                    <tr v-for="i in shopslist">
                        <td>{{i.name}}</td>
                        <td>{{i.price}}</td>
                        <td>{{i.inventory}}</td>
                    </tr>
                </table>
            </div>
        </section>
    </div>
</template>

<script>
import Header from '../../../components/firm_background_header.vue'

export default {
    data(){
        return{
            shopslist:[
                {
                    name:rog,
                    price:24000,
                    inventory:286,
                }
            ]
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

</style>