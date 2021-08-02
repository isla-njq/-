<template>
    <footer>
        <el-pagination
            layout="prev, pager, next"
            :page-count=index
            :hide-on-single-page="true"
            >
        </el-pagination>
    </footer>
</template>
<script>
export default {
    data(){
        return{
            index:6
        }
    }
}
</script>