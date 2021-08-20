<!--新增企业-->
<template>
    <el-form ref="form" :model="form" label-width="80px">
        <el-form-item>
            <section>企业名称</section>
            <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item>
            <section>主营产品或服务</section>
            <el-input v-model="form.services"></el-input>
        </el-form-item>
        <el-form-item>
            <section>主营行业</section>
            <el-input v-model="form.industry"></el-input>
        </el-form-item>
        <el-form-item>
            <section>注册资本</section>
            <el-input v-model="form.capital"></el-input>
        </el-form-item>
        <el-form-item>
            <section>公司成立时间</section>
            <el-input v-model="form.establishment"></el-input>
        </el-form-item>
        <el-form-item>
            <section>公司注册地</section>
            <el-input v-model="form.Incorporation"></el-input>
        </el-form-item>
        <el-form-item>
            <section>企业类型</section>
            <el-input v-model="form.type"></el-input>
        </el-form-item>
        <el-form-item>
            <section>法定代表人</section>
            <el-input v-model="form.representative"></el-input>
        </el-form-item>
        <el-form-item>
            <section>企业联系电话</section>
            <el-input v-model="form.Contact"></el-input>
        </el-form-item>
        <el-form-item>
            <section>企业商品类目</section>
            <el-tag
              :key="tag"
              v-for="tag in dynamicTags"
              closable
              :disable-transitions="false"
              @close="handleClose(tag)">
              {{tag}}
            </el-tag>
            <el-input
              class="input-new-tag"
              v-if="inputVisible"
              v-model="inputValue"
              ref="saveTagInput"
              size="small"
              @keyup.enter.native="handleInputConfirm"
              @blur="handleInputConfirm"
            >
            </el-input>
            <el-button v-else class="button-new-tag" size="small" @click="showInput">新建类目</el-button>
        </el-form-item>
        <el-form-item>
            <section>支持支付方式</section>
            <el-checkbox-group v-model="form.type">
              <el-checkbox label="支付宝" name="type"></el-checkbox>
              <el-checkbox label="微信" name="type"></el-checkbox>
              <el-checkbox label="餐卡" name="type"></el-checkbox>
            </el-checkbox-group>
        </el-form-item>
        <el-form-item class="button">
          <el-button type="primary" @click="onSubmit">立即创建</el-button>
        </el-form-item>
    </el-form>
</template>


<script>
  export default {
    data() {
      return {
        form: {
            name: '',
            services: '',
            industry: '',
            capital: '',
            establishment: '',
            Incorporation: '',
            representative: '',
            Contact: '',
            category: '',
            type: '',
        },
        dynamicTags: [],
        inputVisible: false,
        inputValue: ''
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!');
      },
      handleClose(tag) {
        this.dynamicTags.splice(this.dynamicTags.indexOf(tag), 1);
      },

      showInput() {
        this.inputVisible = true;
        this.$nextTick(_ => {
          this.$refs.saveTagInput.$refs.input.focus();
        });
        console.log(this.dynamicTags)
      },
      handleInputConfirm() {
        let inputValue = this.inputValue;
        if (inputValue) {
          this.dynamicTags.push(inputValue);
        }
        this.inputVisible = false;
        this.inputValue = '';
      }
    }
  }
</script>

<style>
.el-form{
    margin-top: 70px;
    margin-left: auto;
    margin-right: auto;
    max-width: 900px;
}
.el-form-item section{
    width: 20%;
    max-width: 150px;
    text-align: left;
    vertical-align: middle;
    font-size: 14px;
    float: left;
    color: #606266;
    line-height: 40px;
    padding: 0 12px 0 0;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
}
.el-form-item .el-input{
    width: 80%;
    max-width: 500px;
}
.el-tag + .el-tag {
  margin-left: 10px;
}
.button-new-tag {
  margin-left: 10px;
  height: 32px;
  line-height: 30px;
  padding-top: 0;
  padding-bottom: 0;
}
.input-new-tag {
  width: 90px;
  margin-left: 10px;
  vertical-align: bottom;
}
.button{
    margin-left: 20%;
    margin-right: 20%;
}
</style>