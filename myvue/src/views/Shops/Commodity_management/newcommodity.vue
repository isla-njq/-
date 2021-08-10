<!--添加商品-->
<template>
    <div class="main" >
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right">
                    <el-breadcrumb-item>商品管理</el-breadcrumb-item>
                    <el-breadcrumb-item>待上架</el-breadcrumb-item>
                    <el-breadcrumb-item>添加商品</el-breadcrumb-item>
                </el-breadcrumb>
                <section class="section3"><el-button type="primary">批量导入商品</el-button></section>
                <div :style="'height:'+fullHeight+'px;'">
                    
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
		},
        newcom(){
            const that = this
            alert("正在跳转"),
            that.$router.push('/Main/Newcommodity')
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

.foot{
    position:fixed;
    bottom:10px; 
    left:40%; 
    right:50%; 
}
</style>