<!--待上架-->
<template>
    <div class="main" >
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right">
                    <el-breadcrumb-item>商品管理</el-breadcrumb-item>
                    <el-breadcrumb-item>待上架</el-breadcrumb-item>
                </el-breadcrumb>
                <section class="section3"><el-button type="primary" @click="newcom">添加商品</el-button></section>
                <div><el-input v-model="input" @input="queryData" placeholder="请输入内容"></el-input></div>
                <div :style="'height:'+fullHeight+'px;'">
                    <div class="tablecolor">
                        <div class="tr">
                                <div style="width: 40%">商品名称</div>
                                <div style="width: 10%">价格</div>
                                <div style="width: 10%">库存</div>
                                <div style="width: 40%">操作</div>
                            </div>
                        <div v-for="i in shops" :key="i.id" class="tablemain">
                            <span style="width: 40%" class="imggps"><img :src="i.imgurl">{{i.name}}</span>
                            <span style="width: 10%">{{i.price}}</span>
                            <span style="width: 10%">{{i.inventory}}</span>
                            <div style="width: 40%"><section>编辑商品</section><section>上架</section><section>修改</section></div>
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
import axios from 'axios'
export default {
    data(){
        return{
            input:"",
            shops:[],
            shopslist:[
                {
                    id:1,
                    imgurl:"../static/img/Header.png",
                    name:'rog',
                    price:24000,
                    inventory:286,
                },{
                    id:2,
                    name:'abc',
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
        let that = this;
        axios('http://localhost:8080//admin/goods/findStatus?goodsStatus=待上架')
        .then(function (response) {
            that.shopslist=response.data.goodsStatusList;
            console.log(that.shopslist);
        })
        .catch(function (error) {
            console.log(error);
        });
        that.shops=that.shopslist
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
        },
        queryData(){
            //并没有输入关键字时，就不要再搜索了
            if(this.input===''||this.input==null){
                this.shops=this.shopslist;
                return;
            }
            //搜索
            let list=this.shopslist.filter(item=>item.name.indexOf(this.input)>=0);
            this.shops=list;
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