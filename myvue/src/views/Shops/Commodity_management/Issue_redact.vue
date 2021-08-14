<!--修改已发布的商品信息-->
<template>
    <div class="main" >
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right">
                    <el-breadcrumb-item>商品管理</el-breadcrumb-item>
                    <el-breadcrumb-item>已发布</el-breadcrumb-item>
                    <el-breadcrumb-item>编辑商品</el-breadcrumb-item>
                </el-breadcrumb>
                <section class="section3"><el-button type="primary">确定</el-button></section>
                <div :style="'height:'+fullHeight+'px;'" class="classmain">
                    <div class="classdiv">
                        <div class="name">商品名称<el-input v-model="name"></el-input></div>
                        <div class="abouts">
                            <span>商品简介</span> 
                            <el-input
                              type="textarea"
                              :rows="3"
                              placeholder="请输入内容"
                              v-model="abouts"
                              resize="none"
                              class="abouts-input"
                              >
                            </el-input>
                        </div>
                        <div class="price">库存<el-input v-model="price"></el-input></div>
                        <div class="describe">
                            <span>商品描述</span> 
                            <el-input
                              type="textarea"
                              :rows="3"
                              placeholder="请输入内容"
                              v-model="describe"
                              resize="none"
                              class="abouts-input"
                              >
                            </el-input>
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
            name:"",
            abouts:"",
            price:"",
            describe:"",
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
.classmain{
    margin-top: 50px;
    background-color: white;
}
.classdiv{
    width: 700px;
    margin: auto;
}
.classdiv div
{
    text-align: left;
}

.el-input{
    margin: 20px;
    width: 40%;
}

.abouts{
    position: relative;
    height: 100px;
    overflow: hidden;
}
.describe{
    position: relative;
    height: 100px;
    overflow: hidden;
}

.abouts-input{
    position: absolute;
    top:0px;
    left: 65px;
    margin-left: 20px;
    width: 80%;
}
.abouts span{
    position: absolute;
    top:0px;
    left: 0px;
}
.price .el-input{
    margin-left: 55px;
    width: 20%;
}

.foot{
    position:fixed;
    bottom:10px; 
    left:40%; 
    right:50%; 
}
</style>