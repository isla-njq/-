<template>
    <div class="main">
        <Header></Header>
        <main>
            <section class="section1">
                <Nav></Nav>
            </section>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right" class="el-breadcrumb-size">
                    <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
                    <el-breadcrumb-item>账号管理</el-breadcrumb-item>
                </el-breadcrumb>
                <div>
                    <table>
                        <tr>
                            <th>商品名称</th>
                            <th>价格</th>
                            <th>库存</th>
                            <th>操作</th>
                        </tr>
                        <tr v-for="i in shopslist" :key="i.id">
                            <td>{{i.name}}</td>
                            <td>{{i.price}}</td>
                            <td>{{i.inventory}}</td>
                            <td>编辑商品<br/>上架<br/>修改</td>
                        </tr>
                    </table>
                </div>
            </section>
        </main>
        
        <section class="section3"><el-button type="primary">添加商品</el-button></section>
        <Foot class="foot"></Foot>
    </div>
</template>

<script>
import Header from '../../../components/firm_background_header.vue'
import Nav from '../../../components/firm_background_nav.vue'
import Foot from '../../../components/firm_background_foot.vue'
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
        Nav,
        Foot
    },

}
</script>

<style scoped>
main{
    overflow: hidden;
}

.el-breadcrumb-size{
    font-size: 26px;
    line-height: 45px;
}
section{
    float: left;
}
.section2{
    width: 70%;
    text-align: center;
    overflow: hidden;
}
.section3{
    position: fixed;
    right: 30px;
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