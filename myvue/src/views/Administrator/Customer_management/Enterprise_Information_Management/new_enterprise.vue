<template>
    <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="企业名称">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="主营产品或服务">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="主营行业">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="注册资本">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="公司成立时间">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="公司注册地">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="企业类型">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="法定代表人">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="企业联系电话">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="企业商品类目">
            <el-checkbox-group v-model="form.type">
              <el-checkbox label="美食/餐厅线上活动" name="type"></el-checkbox>
              <el-checkbox label="地推活动" name="type"></el-checkbox>
              <el-checkbox label="线下主题活动" name="type"></el-checkbox>
              <el-checkbox label="单纯品牌曝光" name="type"></el-checkbox>
            </el-checkbox-group>
        </el-form-item>
        <el-form-item label="支持支付方式">
            <el-checkbox-group v-model="form.type">
              <el-checkbox label="支付宝" name="type"></el-checkbox>
              <el-checkbox label="微信" name="type"></el-checkbox>
              <el-checkbox label="餐卡" name="type"></el-checkbox>
            </el-checkbox-group>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">立即创建</el-button>
          <el-button>取消</el-button>
        </el-form-item>
    </el-form>
</template>


<script>
  export default {
    data() {
      return {
        form: {
          name: '',
          region: '',
          date1: '',
          date2: '',
          delivery: false,
          type: [],
          resource: '',
          desc: ''
        }
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!');
      }
    }
  }
</script>