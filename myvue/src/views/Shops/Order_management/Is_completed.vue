<!--已完成-->
<template>
    <div class="main" >
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right">
                    <el-breadcrumb-item>订单管理</el-breadcrumb-item>
                    <el-breadcrumb-item>已完成</el-breadcrumb-item>
                </el-breadcrumb>
                <div :style="'height:'+fullHeight+'px;'">
                    <div class="tablecolor">
                        <div class="tr">
                            <div style="width: 14%">订单编号</div>
                            <div style="width: 14%">订单状态</div>
                            <div style="width: 12%">订单用户</div>
                            <div style="width: 12%">订单时间</div>
                            <div style="width: 12%">订单内容</div>
                            <div style="width: 12%">订单价格</div>
                            <div style="width: 12%">订单备注</div>
                            <div style="width: 12%">操作</div>
                        </div>
                        <div v-for="i in shopslist" :key="i.id" class="tablemain">
                            <span style="width: 14%">{{i.control_No}}</span>
                            <span style="width: 14%">{{i.status}}</span>
                            <span style="width: 12%">{{i.username}}</span>
                            <span style="width: 12%">{{i.time}}</span>
                            <span style="width: 12%">{{i.content}}</span>
                            <span style="width: 12%">{{i.price}}</span>
                            <span style="width: 12%">{{i.comment}}</span>
                            <div style="width: 12%"><section>查看订单</section><section>查看评论</section></div>
                        </div>
                    </div>
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
                    price:10,
                    comment:"无",
                },{
                    control_No:181515157,
                    status:"已付款",
                    username:'pzh',
                    time:"2012-02-29",
                    content:"纸尿布",
                    price:1000,
                    comment:"无",
                }
            ],
            fullHeight: document.documentElement.clientHeight - 195
        }
    },
    components:{
        Foot
    },
    watch: {
			fullHeight (val) {//监控浏览器高度变化
				if(!this.timer) {
					this.fullHeight = val
					this.timer = true
					let that = this
					setTimeout(function (){
						that.timer = false
					},400)
				}
				
			}
		},
	mounted () {
		this.get_bodyHeight()
	},
	methods :{
		get_bodyHeight () {//动态获取浏览器高度
			const that = this
			window.onresize = () => {
				return (() => {
					window.fullHeight = document.documentElement.clientHeight
					that.fullHeight = window.fullHeight - 195
				})()
			}
		}
	}
}
</script>

<style scoped>
.main{
    overflow: hidden;
    position: relative;
    background-color: rgb(244, 246, 250);
    max-height: 1180px;
}

.el-breadcrumb{
    background-color: white;
    font-size: 26px;
    line-height: 45px;
    padding-left: 30px;
}
.section2{
    float: right;
    width: 97%;
    text-align: center;
    overflow: hidden;
}
.section3{
    margin: 3px;
    position: absolute;
    right: 100px;
    top: 0px;
    
}
.tablecolor{
    height:100%;
    width:100%;
    background-color: white;
}
table
{
	width:100%;
}
.tr{
    overflow: hidden;
    width: 100%;
}
.tr div{
    float: left;
    background-color: rgb(244, 246, 250);
    font-size: large;
    font-weight:bold;
    text-align: center;
    padding-top: 59px;
    padding-bottom: 10px;
}
.tablemain{
    overflow: hidden;
    height: 100px;
    background-color: white;
    border-bottom: gray 1px solid;
}
.tablemain span{
    display: block;
    float: left;
    padding-top:10px;
    line-height: 80px;
}
.tablemain div{
    float: left;
    padding-top: 20px;
    color:gray;
    font-size: small;
}
.tablemain div section{
    margin: 5px;
}
.foot{
    position:fixed;
    bottom:10px; 
    left:40%; 
    right:50%; 
}
</style>