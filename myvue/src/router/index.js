import Vue from 'vue'
import VueRouter from 'vue-router'

import Login from '@/views/Login'
import Personal_center from '@/views/Personal_center'
import Commodity from '@/views/Shops/Commodity_management/Commodity_management'
import WaitPut from '@/views/Shops/Commodity_management/Wait_putaway'
import Issue from '@/views/Shops/Commodity_management/Issue'
import Unshelve from '@/views/Shops/Commodity_management/UnShelve'
import Sold from '@/views/Shops/Commodity_management/Sold_out'

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
        path:'/Commodity',
        component: Commodity,
        children:[{
            path:"/WaitPut",
            component:WaitPut
        },{
            path:"/Issue",
            component:Issue
        },{
            path:"/Unshelve",
            component:Unshelve
        },{
            path:"/Sold",
            component:Sold
        }]
    },{
        path: "*",
        redirect: '/'
    }
    ]
});