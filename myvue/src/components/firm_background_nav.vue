<template>
    <div>
        <el-row class="tac">
                <el-col>
                  <el-menu
                    class="el-menu-vertical-demo"
                    :unique-opened="true"
                    default-active="/Main/WaitPut"
                    :router="true"
                    >
                    <el-submenu index="1">
                      <template slot="title">
                        <span>商品管理</span>
                      </template>
                      <el-menu-item-group>
                        <el-menu-item index="/Main/WaitPut">待上架</el-menu-item>
                        <el-menu-item index="/Main/Unshelve">已下架</el-menu-item>
                        <el-menu-item index="/Main/Sold">已售罄</el-menu-item>
                        <el-menu-item index="/Main/Issue">已发布</el-menu-item>
                      </el-menu-item-group>
                    </el-submenu>
                    <el-submenu index="2">
                      <template slot="title">
                        <span>订单管理</span>
                      </template>
                      <el-menu-item-group>
                        <el-submenu index="2-1">
                          <template slot="title">全部</template>
                            <el-menu-item index="2-1-1">查看订单</el-menu-item>
                            <el-menu-item index="2-1-2">发货</el-menu-item>
                        </el-submenu>    
                        <el-menu-item index="2-2">待付款</el-menu-item>
                        <el-menu-item index="2-3">待发货</el-menu-item>
                        <el-menu-item index="2-4">待收货</el-menu-item>
                        <el-menu-item index="2-5">已完成</el-menu-item>
                        <el-menu-item index="2-6">已关闭</el-menu-item>
                      </el-menu-item-group> 
                    </el-submenu>
                    <el-submenu index="3">
                      <template slot="title">
                        <span>发票管理</span>
                      </template>  
                      <el-menu-item-group>
                        <el-submenu index="3-1">
                          <template slot="title">全部申请</template>
                          <el-menu-item index="3-1-1">查看申请</el-menu-item>
                          <el-menu-item index="3-1-2">开票</el-menu-item>
                        </el-submenu>
                        <el-menu-item index="3-2">待处理申请</el-menu-item> 
                        <el-menu-item index="3-3">已处理申请</el-menu-item> 
                      </el-menu-item-group>   
                    </el-submenu>
                   <el-submenu index="4">
                      <template slot="title">
                        <span>数据统计</span>
                      </template>  
                      <el-menu-item-group>
                         <el-menu-item index="4-1">商品统计</el-menu-item> 
                         <el-menu-item index="4-2">分类统计</el-menu-item> 
                         <el-menu-item index="4-3">店铺统计</el-menu-item> 
                      </el-menu-item-group>   
                    </el-submenu>
                    <el-submenu index="5">
                      <template slot="title">
                        <span>权限管理</span>
                      </template>
                      <el-menu-item-group>
                          <el-submenu index="5-1">
                            <template slot="title">账号管理</template>  
                            <el-menu-item >修改账号</el-menu-item>
                            <el-menu-item >新增账号</el-menu-item>
                          </el-submenu>
                          <el-menu-item >资金管理</el-menu-item>
                      </el-menu-item-group>
                    </el-submenu>
                  </el-menu>
                </el-col>
            </el-row>
    </div>
</template>

<style scoped>
.tac{
    width: 200px;
}
</style>