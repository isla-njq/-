<template>
  <div class="main">
      <div class="navmain">
        <el-menu
        default-active="/Main/WaitPut"
        background-color="#304156"
        text-color="#fff"
        active-text-color="#ffd04b"
        :router="true"
        class="el-menu-vertical-demo"
        >
          <el-submenu index="1">
            <span slot="title" >商品管理</span>
            <el-menu-item class="list" index="/Main/WaitPut">待上架</el-menu-item>
            <el-menu-item class="list" index="/Main/Unshelve">已下架</el-menu-item>
            <el-menu-item class="list" index="/Main/Sold">已售罄</el-menu-item>
            <el-menu-item class="list" index="/Main/Issue">已发布</el-menu-item>
          </el-submenu>

          <el-submenu index="2">
            <span slot="title">订单管理</span>
            <el-submenu index="2-1">
              <span slot="title">全部</span>
              <el-menu-item index="/Main/Orderall">查看订单</el-menu-item>
              <el-menu-item >发货</el-menu-item>
            </el-submenu>
            <el-menu-item index="/Main/Waitpay">待付款</el-menu-item>
            <el-menu-item index="/Main/Waitship">待发货</el-menu-item>
            <el-menu-item index="/Main/Waitrec">待收货</el-menu-item>
            <el-menu-item index="/Main/Iscompleted">已完成</el-menu-item>
            <el-menu-item index="/Main/Isclose">已关闭</el-menu-item>
          </el-submenu>

          <el-submenu index="3">
            <span slot="title">发票管理</span>
            <el-submenu index="3-1">
              <span slot="title">全部申请</span>
              <el-menu-item index="/Main/Allapply">查看申请</el-menu-item>
              <el-menu-item index="/Main/Newinvoice">开票</el-menu-item>
            </el-submenu>
            <el-menu-item index="/Main/Waitdispose">待处理申请</el-menu-item> 
            <el-menu-item index="/Main/Isdispose">已处理申请</el-menu-item> 
          </el-submenu>

          <el-submenu index="4">
            <span slot="title">数据统计</span>
            <el-menu-item index="/Main/Commoditystatistics">商品统计</el-menu-item> 
            <el-menu-item index="/Main/Classifiedstatistic">分类统计</el-menu-item> 
            <el-menu-item index="/Main/Storestatistics">店铺统计</el-menu-item> 
          </el-submenu>

          <el-submenu index="5">
            <span slot="title">权限管理</span>
            <el-menu-item index="/Main/Accountmanagement">账号管理</el-menu-item>
            <el-menu-item index="/Main/MoneManagement">资金管理</el-menu-item>
          </el-submenu>
        </el-menu>              
      </div>
    </div>
</template>

<style scoped>
.main{
  width: 100%;
}
.el-menu{
  border: 0px;
  font-size: 1rem;
}
</style>