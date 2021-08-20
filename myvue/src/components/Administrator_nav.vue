<template>
  <div class="main">
      <div class="navmain">
        <el-menu
        default-active="/Admain"
        background-color="#304156"
        text-color="#fff"
        active-text-color="#ffd04b"
        :router="true"
        class="el-menu-vertical-demo"
        >
          <el-submenu index="1">
            <span slot="title" >客户管理</span>
            <el-submenu index="1-1">
              <span slot="title">企业信息管理</span>
              <el-menu-item index="/Admain/All_enterprise_information">全部企业信息</el-menu-item>
              <el-menu-item index="/Admain/Newenterprise">新增企业</el-menu-item>
              <el-menu-item index="/Admain/Enterprise_specific_information">查看具体企业信息</el-menu-item>
              <el-menu-item index="/Admain/Modifying_Enterprise_Information">修改企业信息</el-menu-item>
            </el-submenu>
            <el-menu-item class="list" index="/Admain/Member_Information_Management">会员信息管理</el-menu-item>
          </el-submenu>

          <el-submenu index="2">
            <span slot="title">数据统计</span>
            <el-submenu index="2-1">
                <span slot="title">销售统计</span>
                <el-menu-item index="">商品统计</el-menu-item>
                <el-menu-item index="">分类统计</el-menu-item>
                <el-menu-item index="">店铺统计</el-menu-item>
            </el-submenu>
                <el-menu-item index="">资金统计</el-menu-item>
          </el-submenu>
          <el-submenu index="3">
            <span slot="title">系统管理</span>
            <el-submenu index="3-1">
              <span slot="title">角色管理</span>
                <el-menu-item index="/Admain/new_role">新增角色</el-menu-item>
                <el-menu-item index="">角色修改</el-menu-item>
            </el-submenu>
            <el-submenu index="3-2">
              <span slot="title">账户管理</span>
                <el-menu-item index="">修改账号</el-menu-item>
                <el-menu-item index="">新增账号</el-menu-item>
            </el-submenu>
            <el-submenu index="3-3">
              <span slot="title">操作日志</span>
                <el-menu-item index="">账号日志</el-menu-item>
                <el-menu-item index="">店铺日志</el-menu-item>
                <el-menu-item index="">角色日志</el-menu-item>
                <el-menu-item index="">登录日志</el-menu-item>
            </el-submenu>
          </el-submenu>

          <el-submenu index="4">
            <span slot="title">商品订单管理</span>
            <el-menu-item index="/Main/Commoditystatistics">商品统计</el-menu-item> 
            <el-menu-item index="/Main/Classifiedstatistic">分类统计</el-menu-item> 
            <el-menu-item index="/Main/Storestatistics">店铺统计</el-menu-item> 
          </el-submenu>

          <el-submenu index="5">
            <span slot="title">企业员工管理</span>
            <el-menu-item index="">管理企业员工信息</el-menu-item>
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