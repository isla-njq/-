<!--资金管理-->
<template>
    <div class="main" >
        <main>
            <section class="section2">
                <el-breadcrumb separator-class="el-icon-arrow-right">
                    <el-breadcrumb-item>权限管理</el-breadcrumb-item>
                    <el-breadcrumb-item>资金管理</el-breadcrumb-item>
                </el-breadcrumb>
                <div :style="'height:'+fullHeight+'px;'" class="div">
                    <div class="Running_water">
                        <el-table
                            :data="Money_statistics"
                            style="width: 100%">
                        <el-table-column
                            prop="order_number"
                            label="订单编号"
                            style="color: green">
                        </el-table-column>
                        <el-table-column
                            prop="trading_time"
                            label="支付时间"
                            >
                        </el-table-column>
                        <el-table-column
                            prop="trading_type"
                            label="支付方式"
                            >
                        </el-table-column>
                        <el-table-column
                            prop="order_money"
                            label="订单金额"
                            >
                        </el-table-column>
                        <el-table-column
                            prop="Coupon_money"
                            label="优惠券金额"
                            >
                        </el-table-column>
                        <el-table-column
                            prop="pay_money"
                            label="支付金额"
                            >
                        </el-table-column>
                        <el-table-column
                            prop="store"
                            label="店铺名称"
                            >
                        </el-table-column>
                        <el-table-column
                            prop="members"
                            label="会员(手机号)"
                            >
                        </el-table-column>
                        </el-table>
                    </div>
                </div>
                <Foot class="foot"></Foot>
            </section>
        </main>
    </div>
</template>

<script>
import Foot from '../../../components/firm_background_foot.vue'
export default {
    data(){
        return{
            Money_statistics: [
                {
                    
                    order_number: 11323213213,
                    trading_time:'2020-1-1 16:00:00',
                    trading_type:'支付宝',
                    order_money:24000,
                    Coupon_money:0,
                    pay_money: 24000,
                    store: '小熊杂货店',
                    members:'1112321321'
                },{
                    
                    order_number: 11323213213,
                    trading_time:'2020-1-1 16:00:00',
                    trading_type:'支付宝',
                    order_money:24000,
                    Coupon_money:10000,
                    pay_money: 14000,
                    store:'小熊杂货店',
                    members:'1112321321'
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

.div{
    width: 100%;
}

.Running_water{
    overflow: hidden;
    margin-top: 50px;
    width: 100%;
    height: 100%;
    background-color: white;
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