<!--商品统计-->
<template>
    <div class="main" >
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right">
                    <el-breadcrumb-item>数据统计</el-breadcrumb-item>
                    <el-breadcrumb-item>商品统计</el-breadcrumb-item>
                </el-breadcrumb>
                <div :style="'height:'+fullHeight+'px;'">
                    <div class="tablecolor">
                        <div class="tr">
                                <div style="width: 20%">店铺名</div>
                                <div style="width: 20%">商品</div>
                                <div style="width: 20%">订单量</div>
                                <div style="width: 20%">销量量</div>
                                <div style="width: 20%">销售额</div>
                            </div>
                        <div v-for="i in shopslist" :key="i.id" class="tablemain">
                            <span style="width: 20%">{{i.name}}</span>
                            <span style="width: 20%">{{i.price}}</span>
                            <span style="width: 20%">{{i.inventory}}</span>
                            <span style="width: 20%">{{i.inventory}}</span>
                            <span style="width: 20%">{{i.inventory}}</span>
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
                    imgurl:"../static/img/Header.png",
                    name:'rog',
                    price:24000,
                    inventory:286,
                },{
                    id:2,
                    name:'rog',
                    price:24800,
                    inventory:287,
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
.imggps{
    position: relative;
}
.tablemain img{
    display: block;
    position:absolute;
    top: 25px;
    right: 57%;
    width: 80px;
    height: 50px;
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