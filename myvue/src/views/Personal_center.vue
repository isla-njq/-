<template>
  <div>
    {{ $route.query.userId }}
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {},
  mounted() {
    let data = {
      username: $route.query.userId,
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