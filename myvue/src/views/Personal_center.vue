<template>
  <div>
    {{ $store.state.user }}
    <div><br/>-------------------<br/></div>
    {{ $store.state.password }}
  </div>
</template>

<script>
import axios from "axios";
import Qs from 'qs'
export default {
  data() {},
  mounted() {
    let data = {
      username: this.$store.state.user,
      userpassword: this.$store.state.password
    };
    axios({
      headers: {
        "Content-Type": "application/x-www-form-urlencoded",
      },
      method: "post",
      url: "http://localhost:8080/admin/login_admin",
      data: Qs.stringify(data),
    }).then(function (response) {
      if (response.data.status == false) {
        alert(response.data.message);
      }
      console.log(1111, response.data);
    });
  },
};
</script>