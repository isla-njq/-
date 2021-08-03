<template>
    <div>
        <el-row class="tac">
                <el-col>
                  <el-menu
                    class="el-menu-vertical-demo"
                    :unique-opened="true"
                    default-active="/WaitPut"
                    :router="true"
                    >
                    <el-submenu index="1">
                      <template slot="title">
                        <span>商品列表</span>
                      </template>
                      <el-menu-item-group>
                        <el-menu-item index="/WaitPut">待上架</el-menu-item>
                        <el-menu-item index="/Issue">已发布</el-menu-item>
                        <el-menu-item index="/Unshelve">已下架</el-menu-item>
                        <el-menu-item index="/Sold">已售罄</el-menu-item>
                      </el-menu-item-group>
                    </el-submenu>
                    <el-submenu index="2">
                      <template slot="title">
                        <span>订单列表</span>
                      </template>
                      <el-menu-item-group>
                        <el-menu-item index="2-1">待上架</el-menu-item>
                        <el-menu-item index="2-2">已发布</el-menu-item>
                        <el-menu-item index="2-3">已下架</el-menu-item>
                        <el-menu-item index="2-4">已售罄</el-menu-item>
                      </el-menu-item-group>
                    </el-submenu>
                    <el-submenu index="3">
                      <template slot="title">
                        <span>发票管理</span>
                      </template>
                    </el-submenu>
                   <el-submenu index="4">
                      <template slot="title">
                        <span>数据统计</span>
                      </template>
                    </el-submenu>
                    <el-submenu index="5">
                      <template slot="title">
                        <span>账号管理</span>
                      </template>
                    </el-submenu>
                    <el-submenu index="6">
                      <template slot="title">
                        <span>资金统计</span>
                      </template>
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