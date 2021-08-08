<template>
    <div>
        <el-row class="tac">
                <el-col>
                  <el-menu
                    class="el-menu-vertical-demo"
                    default-active="/Main/WaitPut"
                    background-color="#304156"
                    text-color="#fff"
                    active-text-color="#ffd04b"
                    :router="true"
                    >
                    <el-submenu index="1"
                    background-color="#ffd04b"
                    active-text-color="#304156"
                    >
                      <span slot="title">商品管理</span>
                      <el-menu-item-group>
                        <el-menu-item class="list" index="/Main/WaitPut">待上架</el-menu-item>
                        <el-menu-item class="list" index="/Main/Unshelve">已下架</el-menu-item>
                        <el-menu-item class="list" index="/Main/Sold">已售罄</el-menu-item>
                        <el-menu-item class="list" index="/Main/Issue">已发布</el-menu-item>
                      </el-menu-item-group>
                    </el-submenu>
                    <el-submenu index="2">
                      <template slot="title">
                        <span>订单管理</span>
                      </template>
                      <el-menu-item-group>
                        <el-submenu index="2-1">
                          <template slot="title">全部</template>
                            <el-menu-item index="/Main/Orderall">查看订单</el-menu-item>
                            <el-menu-item >发货</el-menu-item>
                        </el-submenu>    
                        <el-menu-item index="/Main/Waitpay">待付款</el-menu-item>
                        <el-menu-item index="/Main/Waitship">待发货</el-menu-item>
                        <el-menu-item index="/Main/Waitrec">待收货</el-menu-item>
                        <el-menu-item index="/Main/Iscompleted">已完成</el-menu-item>
                        <el-menu-item index="/Main/Isclose">已关闭</el-menu-item>
                      </el-menu-item-group> 
                    </el-submenu>
                    <el-submenu index="3">
                      <template slot="title">
                        <span>发票管理</span>
                      </template>  
                      <el-menu-item-group>
                        <el-submenu index="3-1">
                          <template slot="title">全部申请</template>
                          <el-menu-item index="/Main/Allapply">查看申请</el-menu-item>
                          <el-menu-item index="/Main/Newinvoice">开票</el-menu-item>
                        </el-submenu>
                        <el-menu-item index="/Main/Waitdispose">待处理申请</el-menu-item> 
                        <el-menu-item index="/Main/Isdispose">已处理申请</el-menu-item> 
                      </el-menu-item-group>   
                    </el-submenu>
                   <el-submenu index="4">
                      <template slot="title">
                        <span>数据统计</span>
                      </template>  
                      <el-menu-item-group>
                         <el-menu-item index="/Main/Commoditystatistics">商品统计</el-menu-item> 
                         <el-menu-item index="/Main/Classifiedstatistic">分类统计</el-menu-item> 
                         <el-menu-item index="/Main/Storestatistics">店铺统计</el-menu-item> 
                      </el-menu-item-group>   
                    </el-submenu>
                    <el-submenu index="5">
                      <template slot="title">
                        <span>权限管理</span>
                      </template>
                      <el-menu-item-group>
                          <el-menu-item index="/Main/Accountmanagement">账号管理</el-menu-item>
                          <el-menu-item index="/Main/MoneManagement">资金管理</el-menu-item>
                      </el-menu-item-group>
                    </el-submenu>
                  </el-menu>
                </el-col>
            </el-row>
    </div>
</template>

<style scoped>
.tac{
  width: 220px;
}
</style>