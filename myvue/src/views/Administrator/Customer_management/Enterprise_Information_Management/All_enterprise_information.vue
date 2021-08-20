<!--全部企业信息-->
<template>
    <div class="main">
        <el-table
          ref="multipleTable"
          :data="tableData"
          tooltip-effect="dark"
          style="width: 100%">
          <el-table-column
            type="selection"
            width="55"
            align="center">
          </el-table-column>
          <el-table-column
            prop="date"
            label="企业名称"
            width="120"
            align="center">
          </el-table-column>
          <el-table-column
            prop="name"
            label="法人"
            width="120"
            align="center">
          </el-table-column>
          <el-table-column
            prop="address"
            label="企业信息"
            width="250"
            show-overflow-tooltip>
          </el-table-column>
          <el-table-column
            prop="taptype"
            label="支付类型"
            width="170"
            align="center">
          </el-table-column>
          <el-table-column
            prop="class"
            label="类目"
            width="300"
            align="center">
          </el-table-column>
          <el-table-column
            prop="operation"
            label="操作"
            width="150"
            align="center">
            <el-button size="mini">操作</el-button>
            <el-button size="mini">删除</el-button>
          </el-table-column>
        </el-table>
        <div style="margin-top: 20px">
          <el-button @click="toggleSelection()">取消选择</el-button>
        </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
          class:[],
        }, {
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
        }, {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
        }, {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
        }, {
          date: '2016-05-08',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
        }, {
          date: '2016-05-06',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
        }, {
          date: '2016-05-07',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄',
          taptype:"",
          type:["支付宝","微信","餐卡"],
        }],
        multipleSelection: []
      }
    },
    mounted () {
        this.addtype();
    },
    methods: {
        addtype(){
            let that = this;
            for(var i = 0; i < that.tableData.length; i++){
                for(var j = 0; j < that.tableData[i].type.length; j++){
                    that.tableData[i].taptype += that.tableData[i].type[j];
                    if(j != that.tableData[i].type.length - 1){
                        that.tableData[i].taptype += " ";
                    }
                }
                console.log(that.tableData[i].taptype)
            }
        },
        toggleSelection(rows) {
          if (rows) {
            rows.forEach(row => {
              this.$refs.multipleTable.toggleRowSelection(row);
            });
          } else {
            this.$refs.multipleTable.clearSelection();
          }
        },
    }
  }
</script>

<style scoped>
.main{
    margin-top: 70px;
    margin-left: auto;
    margin-right: auto;
    max-width: 1180px;
}
</style>