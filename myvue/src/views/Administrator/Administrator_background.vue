<template>
    <div>
        <el-row class="tac">
                <el-col>
                  <el-menu
                    class="el-menu-vertical-demo"
                    unique-opened="true"
                    open="1-1"
                    background-color="#545c64"
                    text-color="#fff"
                    
                    >
                    <el-submenu index="1">
                      <template slot="title">
                        <span>客户管理</span>
                      </template>
                        <el-submenu index = "1-1">
                          <template slot="title">企业信息管理</template>
                          <el-menu-item index="1-1-1">新增企业</el-menu-item>
                          <el-menu-item index="1-1-2">查看企业信息</el-menu-item> 
                          <el-menu-item index="1-1-3">修改企业信息</el-menu-item>
                        </el-submenu>
        
                        <el-menu-item-group>
                        <el-menu-item index="1-2">会员信息管理</el-menu-item>
                        </el-menu-item-group>
                    </el-submenu>


                    <el-submenu index="2">
                      <template slot="title">
                        <span>数据统计</span>
                      </template>
                        <el-submenu index = "2-1">
                          <template slot="title">销售统计</template>
                          <el-menu-item index="2-1-1">商品统计</el-menu-item>
                          <el-menu-item index="2-1-2">分类统计</el-menu-item> 
                          <el-menu-item index="2-1-3">店铺统计</el-menu-item>
                        </el-submenu>
                        <el-menu-item-group>
                        <el-menu-item index="2-2">资金统计</el-menu-item>
                        </el-menu-item-group>
                    </el-submenu>


                    <el-submenu index="3">
                      <template slot="title">
                        <span>系统管理</span>
                      </template>
                        <el-submenu index = "3-1">
                          <template slot="title">角色管理</template>
                          <el-menu-item index="3-1-1">新增角色</el-menu-item>
                          <el-menu-item index="3-1-2">角色修改</el-menu-item> 
                        </el-submenu>
        
                       <el-submenu index = "3-2">
                          <template slot="title">账号管理</template>
                          <el-menu-item index="3-2-1">修改账号</el-menu-item>
                          <el-menu-item index="3-2-2">新增账号</el-menu-item> 
                        </el-submenu>

                        <el-submenu index = "3-3">
                          <template slot="title">操作日志</template>
                          <el-menu-item index="3-3-1">账号日志</el-menu-item>
                          <el-menu-item index="3-3-2">店铺日志</el-menu-item>
                          <el-menu-item index="3-3-3">角色日志</el-menu-item> 
                          <el-menu-item index="3-3-4">登录日志</el-menu-item>  
                        </el-submenu>
                    </el-submenu>

                    <el-submenu index="4">
                      <template slot="title">
                        <span>商品管理</span> 
                      </template>
                        <el-submenu index = "4-1">
                          <template slot="title">待上架</template>
                          <el-submenu index="4-1-1">
                            <template slot="title">修改待上架商品信息</template>
                            <el-menu-item-group>
                            <el-menu-item index="4-1-1-1">编辑分类</el-menu-item>
                            <el-menu-item index="4-1-1-2">添加规格</el-menu-item>
                            <el-menu-item index="4-1-1-3">自定义规格</el-menu-item>
                            </el-menu-item-group>
                          </el-submenu>
                          
                        </el-submenu>
                        <el-submenu index = "4-2">
                          <template slot="title">已发布</template>
                          <el-menu-item index="4-2-1">修改已发布商品信息</el-menu-item>
                        </el-submenu>
                        <el-submenu index = "4-3">
                          <template slot="title">已下架</template>
                          <el-submenu index="4-3-1">
                            <template slot="title">修改已下架商品信息</template>
                            <el-menu-item-group>
                            <el-menu-item index="4-3-1-1">编辑分类</el-menu-item>
                            <el-menu-item index="4-3-1-2">添加规格</el-menu-item>
                            <el-menu-item index="4-3-1-3">自定义规格</el-menu-item>
                            </el-menu-item-group>
                          </el-submenu>
                          
                        </el-submenu>
                        <el-submenu index = "4-4">
                          <template slot="title">已售罄</template>
                          <el-menu-item index="4-4-1">修改已售罄商品信息</el-menu-item>
                        </el-submenu>
                      </el-submenu>



                    <el-submenu index="5">
                      <template slot="title">
                        <span>订单管理</span> 
                      </template>
                        <el-submenu index = "5-1">
                          <template slot="title">查询所有</template>
                          <el-menu-item-group>
                            <el-menu-item index="5-1-1">查看评论</el-menu-item>
                            <el-menu-item index="5-1-2">查看订单</el-menu-item>
                            <el-menu-item index="5-1-3">查看物流</el-menu-item>
                          </el-menu-item-group>
                        </el-submenu>
                        
                        <el-menu-item index="5-2">待付款</el-menu-item>
                        <el-menu-item index="5-3">待发货</el-menu-item>
                        
                        <el-submenu index = "5-4">
                          <template slot="title">待收货</template>
                          <el-menu-item-group>
                            <el-menu-item index="5-4-1">查看物流</el-menu-item>
                          </el-menu-item-group>
                        </el-submenu>
                        <el-submenu index = "5-5">
                          <template slot="title">已完成</template>
                          <el-menu-item index="5-5-1">查看订单</el-menu-item>
                          <el-menu-item index="5-5-2">查看评论</el-menu-item>
                        </el-submenu>
                        
                        <el-menu-item index="5-6">已关闭</el-menu-item>
                        
                    </el-submenu>
                    <el-menu-item index="6">商家管理</el-menu-item>
                  <el-submenu index="7">
                      <template slot="title">
                        企业员工信息管理
                      </template>
                        <el-menu-item-group>
                          <el-menu-item index="7-1">新增企业员工</el-menu-item>
                          <el-menu-item index="7-2">修改企业员工信息</el-menu-item>
                          <el-menu-item index="7-3">删除企业员工</el-menu-item>
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