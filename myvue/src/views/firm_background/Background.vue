<template>
    <div>
        <main>
            <div>
                <ul>
                    <li><router-link to='/Background1'>企业信息管理</router-link></li>
                    <li>会员信息管理</li>
                    <li>角色管理</li>
                    <li>账号管理</li>
                    <li>操作日志</li>
                    <li>商品管理</li>
                    <li>订单管理</li>
                    <li>商家管理</li>
                </ul>
            </div>
            <router-view></router-view>
        </main>
    </div>
</template>

<script>
export default {
    data(){
        
    }
}
</script>

<style scoped>

</style>