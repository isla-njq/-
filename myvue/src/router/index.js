import Vue from 'vue'
import VueRouter from 'vue-router'

import Login from '@/views/Login'
import Personal_center from '@/views/Personal_center'
import Main from '@/views/Shops/Main'
import WaitPut from '@/views/Shops/Commodity_management/Wait_putaway'
import Issue from '@/views/Shops/Commodity_management/Issue'
import Unshelve from '@/views/Shops/Commodity_management/UnShelve'
import Sold from '@/views/Shops/Commodity_management/Sold_out'
import Orderall from '@/views/Shops/Order_management/Order_all'
import Waitpay from '@/views/Shops/Order_management/wait_payment'
import Waitship from '@/views/Shops/Order_management/wait_shipment'
import Waitrec from '@/views/Shops/Order_management/wait_Receiving' 
import Iscompleted from '@/views/Shops/Order_management/Is_completed' 
import Isclose from '@/views/Shops/Order_management/Is_close' 
import Allapply from '@/views/Shops/invoice_management/All_apply'
import Newinvoice from '@/views/Shops/invoice_management/new_invoice'
import Waitdispose from '@/views/Shops/invoice_management/Wait_dispose'
import Isdispose from '@/views/Shops/invoice_management/Is_dispose'
import Commoditystatistics from '@/views/Shops/Data_Management/Commodity_statistics'
import Classifiedstatistic from '@/views/Shops/Data_Management/Classified_statistic'
import Storestatistics from '@/views/Shops/Data_Management/Store_statistics'
import Accountmanagement from '@/views/Shops/Authority_management/Account_management'
import MoneManagement from '@/views/Shops/Authority_management/Mone_Management'

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
        path:'/Main',
        component: Main,
        children:[{
            path:"/Main/WaitPut",
            component:WaitPut
        },{
            path:"/Main/Issue",
            component:Issue
        },{
            path:"/Main/Unshelve",
            component:Unshelve
        },{
            path:"/Main/Sold",
            component:Sold
        },{
            path:"/Main/Orderall",
            component:Orderall
        },{
            path:"/Main/Waitpay",
            component:Waitpay
        },{
            path:"/Main/Waitship",
            component:Waitship
        },{
            path:"/Main/Waitrec",
            component:Waitrec
        },{
            path:"/Main/Iscompleted",
            component:Iscompleted
        },{
            path:"/Main/Isclose",
            component:Isclose
        },{
            path:"/Main/Allapply",
            component:Allapply
        },{
            path:"/Main/Newinvoice",
            component:Newinvoice
        },{
            path:"/Main/Waitdispose",
            component:Waitdispose
        },{
            path:"/Main/Isdispose",
            component:Isdispose
        },{
            path:"/Main/Commoditystatistics",
            component:Commoditystatistics
        },{
            path:"/Main/Classifiedstatistic",
            component:Classifiedstatistic
        },{
            path:"/Main/Storestatistics",
            component:Storestatistics
        },{
            path:"/Main/Accountmanagement",
            component:Accountmanagement
        },{
            path:"/Main/MoneManagement",
            component:MoneManagement
        },{
            path: "/",
            redirect: '/Main/WaitPut'
        }]
    },{
        path: "*",
        redirect: '/'
    }
    ]
});