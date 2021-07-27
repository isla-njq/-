import Vue from 'vue'
import VueRouter from 'vue-router'

import Login from '@/views/Login'
import Personal_center from '@/views/Personal_center'

Vue.use(VueRouter)

export default new VueRouter({
    mode: 'history',
    routes: [{
        path:"/",
        component:Login
      },{
        path:"*",
        redirect:'/'
      },{
        path:'/Personal_center',
        name:'Personal center',
        component:Personal_center
      }
    ]
  });