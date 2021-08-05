<!--已关闭-->
<template>
    <div class="main">
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right" class="el-breadcrumb-size">
                    <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
                    <el-breadcrumb-item>已关闭</el-breadcrumb-item>
                </el-breadcrumb>
                <div>
                    <table>
                        <tr>
                            <th>订单编号</th>
                            <th>订单状态</th>
                            <th>订单用户</th>
                            <th>订单时间</th>
                            <th>订单内容</th>
                            <th>订单价格</th>
                            <th>订单备注</th>
                        </tr>
                        <tr v-for="i in shopslist" :key="i.id">
                            <td>{{i.control_No}}</td>
                            <td>{{i.status}}</td>
                            <td>{{i.username}}</td>
                            <td>{{i.time}}</td>
                            <td>{{i.content}}</td>
                            <td>{{i.price}}</td>
                            <td>{{i.comment}}</td>
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
                    control_No:181515156,
                    status:"待付款",
                    username:'njq',
                    time:"2012-02-05",
                    content:"卡通鼠标垫",
                    Remaining_Time:"10:30:29",
                    price:10,
                    comment:"无",
                },{
                    control_No:181515157,
                    status:"已付款",
                    username:'pzh',
                    time:"2012-02-29",
                    content:"纸尿布",
                    Remaining_Time:"29:59:59",
                    price:1000,
                    comment:"无",
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