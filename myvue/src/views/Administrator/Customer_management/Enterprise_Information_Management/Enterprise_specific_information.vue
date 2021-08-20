<!--具体企业信息-->
<template>
    <div class="main">
        <section><span>企业名称</span><div>{{name}}</div></section>
        <section><span>主营产品或服务</span><div>{{services}}</div></section>
        <section><span>主营行业</span><div>{{industry}}</div></section>
        <section><span>注册资本</span><div>{{capital}}</div></section>
        <section><span>公司成立时间</span><div>{{establishment}}</div></section>
        <section><span>公司注册地</span><div>{{Incorporation}}</div></section>
        <section><span>企业类型</span><div>{{representative}}</div></section>
        <section><span>法定代表人</span><div>{{Contact}}</div></section>
        <section><span>企业联系电话</span><div>{{category}}</div></section>
        <section><span>企业商品类目</span><div>{{name}}</div></section>
        <section><span>支持支付方式</span><div>{{type}}</div></section>
    </div>
</template>

<script>
export default {
    data() {
      return {
        name: 'xxx',
        services: 'xxx',
        industry: 'xxx',
        capital: 'xxx',
        establishment: 'xxx',
        Incorporation: 'xxx',
        representative: 'xxx',
        Contact: 'xxx',
        category: 'xxx',
        type:["微信","支付宝"],
      }
    },
}
</script>

<style scoped>
.main{
    margin-top: 70px;
}
section{
    overflow: hidden;
    margin: auto;
    max-width: 500px;
    line-height: 40px;
}
section span{
    float: left;
    width: 50%;
}
section div{
    float: right;
    width: 50%;
}
</style>