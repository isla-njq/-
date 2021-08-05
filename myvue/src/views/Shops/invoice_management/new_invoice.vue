<!--全部申请/开票-->
<template>
    <div class="main">
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right" class="el-breadcrumb-size">
                    <el-breadcrumb-item :to="{ path: '/' }">全部申请</el-breadcrumb-item>
                    <el-breadcrumb-item>开票</el-breadcrumb-item>
                </el-breadcrumb>
                <div>
                    主要界面
                </div>
            </section>
        </main>
        <section class="section3"><el-button type="primary">添加商品</el-button></section>
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
                    price:10,
                    time1:"2012-02-05",
                    time2:'2012-02-05',
                    time3:"2012-02-05",
                    comment:"无",
                },{
                    control_No:181515157,
                    price:1000,
                    time1:"2012-02-05",
                    time2:'2012-02-05',
                    time3:"2012-02-05",
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