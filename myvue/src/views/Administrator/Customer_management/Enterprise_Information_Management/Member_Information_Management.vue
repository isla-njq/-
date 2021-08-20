<!-- 会员信息管理 -->
<<template>
    <el-table
      :data="tableData"
      style="width: 100%">
      <el-table-column
        prop="date"
        label="手机号"
        width="180">
      </el-table-column>
      <el-table-column
        prop="name"
        label="姓名"
        width="180">
      </el-table-column>
      <el-table-column
        prop="time"
        label="封禁时间">
      </el-table-column>
      <el-table-column
        label="封禁状态">
      </el-table-column>
        <template slot-scope="scope">
            <el-switch
            v-model="scope.row.value"
            active-text="封禁"
            inactive-text="未封禁">
            </el-switch>
        </template>
        
      <el-table-column
        prop="address"
        label="用户地址管理">
      </el-table-column>
    </el-table>
</template>

  <script>
    export default {
      data() {
        return {
          tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            time:"",
            value: true,
            address: '上海市普陀区金沙江路 1518 弄'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            time:"",
            value: false,
            address: '上海市普陀区金沙江路 1517 弄'
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }]
        }
      }
    }
  </script>