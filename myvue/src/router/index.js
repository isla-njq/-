import Vue from 'vue'
import VueRouter from 'vue-router'

import Login from '@/views/Login'
import Personal_center from '@/views/Personal_center'
import Background from '@/views/firm_background/Background'
import Background1 from '@/views/firm_background/Background1'
import WaitPut from '@/views/Shops/Commodity_management/Wait_putaway'

Vue.use(VueRouter)

export default new VueRouter({
    // mode: 'history',
    routes: [{
        path: "/",
        component: Login
    }, {
        path: '/Personal_center',
        component: Personal_center
    }, {
        path:'/Background',
        component: Background,
        children:[{
            path:"/Background1",
            component:Background1
        }]
    }, {
        path:'/WaitPut',
        component:WaitPut
    },{
        path: "*",
        redirect: '/'
    }
    ]
});