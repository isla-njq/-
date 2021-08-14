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
                <div :style="'height:'+fullHeight+'px;'" class="classmain">
                    <div class="name">商品名称<el-input ></el-input></div>
                    <div class="classify">
                        商品分类
                        <el-cascader
                          v-model="value"
                          :options="options"
                          :props="{ expandTrigger: 'hover' }"
                          @change="handleChange">
                        </el-cascader>
                    </div>
                    <div class="abouts">
                        <span>商品简介</span> 
                        <el-input
                          type="textarea"
                          :rows="3"
                          placeholder="请输入内容"
                          v-model="textarea"
                          resize="none"
                          class="abouts-input"
                          >
                        </el-input>
                    </div>
                    <div>商品封面图</div>
                    <div class="divupload">
                        <section>商品轮播图</section>
                        <div>
                            <el-upload
                                action="#"
                                list-type="picture-card"
                                :auto-upload="false"
                                ref="pictureUpload"
                                >
                                  <i slot="default" class="el-icon-plus"></i>
                                  <div slot="file" slot-scope="{file}">

                                    <img
                                      class="el-upload-list__item-thumbnail"
                                      :src="file.url" alt=""
                                    >
                                    <span class="el-upload-list__item-actions">
                                        <span
                                          class="el-upload-list__item-preview"
                                          @click="handlePictureCardPreview(file)"
                                        >
                                          <i class="el-icon-zoom-in"></i>
                                        </span>
                                        <span
                                          v-if="!disabled"
                                          class="el-upload-list__item-delete"
                                          @click="handleRemove(file)"
                                        >
                                          <i class="el-icon-delete"></i>
                                        </span>
                                    </span>
                                  </div>
                            </el-upload>
                            <el-dialog :visible.sync="dialogVisible">
                              <img width="100%" :src="dialogImageUrl" alt="">
                            </el-dialog>
                        </div>   
                    </div>
                    <div>商品规格</div>
                    <div class="price">商品价格<el-input ></el-input>库存<el-input ></el-input></div>
                    <div class="describe">
                        <span>商品描述</span> 
                        <el-input
                          type="textarea"
                          :rows="3"
                          placeholder="请输入内容"
                          v-model="textarea"
                          resize="none"
                          class="abouts-input"
                          >
                        </el-input>
                    </div>
                </div>
            </section>
        </main>
    </div>
</template>

<script>
import Foot from '../../../components/firm_background_foot.vue'
export default {
    data(){
        return{
            options: [{
                value: 'zhinan',
                label: '指南',
                children: [{
                  value: 'shejiyuanze',
                  label: '设计原则',
                  children: [{
                    value: 'yizhi',
                    label: '一致'}
                  ]
                }, {
                  value: 'daohang',
                  label: '导航',
                  children: [{
                    value: 'cexiangdaohang',
                    label: '侧向导航'
                  }]
                }]
                },{
                value: 'zujian',
                label: '组件',
                children: [{
                  value: 'basic',
                  label: 'Basic',
                  children: [{
                    value: 'color',
                    label: 'Color 色彩'
                  }]
                }, {
                  value: 'form',
                  label: 'Form',
                  children: [{
                    value: 'radio',
                    label: 'Radio 单选框'
                  },]
                }, {
                  value: 'data',
                  label: 'Data',
                  children: [{
                    value: 'table',
                    label: 'Table 表格'
                  }]
                }, {
                  value: 'notice',
                  label: 'Notice',
                  children: [{
                    value: 'alert',
                    label: 'Alert 警告'
                  }]
                }, {
                  value: 'navigation',
                  label: 'Navigation',
                  children: [{
                    value: 'menu',
                    label: 'NavMenu 导航菜单'
                  }]
                }, {
                  value: 'others',
                  label: 'Others',
                  children: [{
                    value: 'dialog',
                    label: 'Dialog 对话框'
                  }]
                }]
                }, {
                  value: 'ziyuan',
                  label: '资源',
                  children: [{
                    value: 'axure',
                    label: 'Axure Components'
                  }, {
                    value: 'sketch',
                    label: 'Sketch Templates'
                  }, {
                    value: 'jiaohu',
                    label: '组件交互文档'
                  }]
                }],
            fullHeight: document.documentElement.clientHeight - 195,
            dialogImageUrl: '',
            dialogVisible: false,
            disabled: false
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
        },
        handleRemove(file) {
            //获取到该组件调用handleRemove方法删除file对象
            this.$refs.pictureUpload.handleRemove(file)
        },
        handlePictureCardPreview(file) {
            this.dialogImageUrl = file.url;
            this.dialogVisible = true;
        },
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
.classmain div
{
    text-align: left;
}

.el-input{
    margin: 20px;
    width: 40%;
}

.el-cascader{
    margin:20px 20px 20px 15px;
    width: 40%
}

.abouts{
    position: relative;
    height: 100px;
    overflow: hidden;
}
.abouts span{
    position: absolute;
    top: 20px;
    left: 0px;
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
    margin: 20px;
    width: 60%;
}
.divupload{
    overflow: hidden;
}
.divupload section{
    float: left;
    margin-right: 20px;
}
.divupload div{
    float: left;
}
.price .el-input{
    margin-left: 20px;
    width: 10%;
}


</style>