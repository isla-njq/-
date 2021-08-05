<!--店铺统计-->
<template>
    <div class="main">
        <main>
            <section>
                选着需要查看的店铺统计
            </section>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right" class="el-breadcrumb-size">
                    <el-breadcrumb-item :to="{ path: '/' }">数据统计</el-breadcrumb-item>
                    <el-breadcrumb-item>店铺统计</el-breadcrumb-item>
                </el-breadcrumb>
                <div>
                    <table>
                        <tr>
                            <th>店铺</th>
                            <th>商品数量</th>
                            <th>销量量</th>
                            <th>销售额</th>
                        </tr>
                        <tr v-for="i in shopslist" :key="i.id">
                            <td>{{i.name}}</td>
                            <td>{{i.commodity}}</td>
                            <td>{{i.inventory}}</td>
                            <td>{{i.sales}}</td>
                        </tr>
                    </table>
                </div>
            </section>
        </main>
        <Foot class="foot"></Foot>
    </div>
</template>

<script>
import Foot from '../../../components/firm_background_foot.vue'
export default {
    data(){
        return{
            shopslist:[
                {
                    id:1,
                    name:'小熊杂货店',
                    commodity:'可乐',
                    price:24000,
                    sales:550,
                    inventory:286,
                },{
                    id:2,
                    name:'小熊杂货店',
                    commodity:'可乐',
                    price:24000,
                    sales:550,
                    inventory:286,
                }
            ]
        }
    },
    components:{
        Foot
    },

}
</script>

<style scoped>
main{
    overflow: hidden;
    position: relative;
}

.el-breadcrumb-size{
    font-size: 26px;
    line-height: 45px;
}
.section2{
    width: 90%;
    text-align: center;
    overflow: hidden;
}
.section3{
    position: absolute;
    right: 100px;
    top: 155px;
}
table
{
	width:100%;
}
th
{
	height:50px;
}
.foot{
    position:fixed;
    bottom:10px; 
    left:40%; 
    right:50%; 
}
</style>