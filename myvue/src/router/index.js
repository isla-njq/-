import Vue from 'vue'
import VueRouter from 'vue-router'

//店铺侧
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

import Newcommodity from '@/views/Shops/Commodity_management/newcommodity'
import Issueredact from '@/views/Shops/Commodity_management/Issue_redact'

//管理员侧
import Admain from '@/views/Administrator/Main'
//客户管理
import All_enterprise_information from '@/views/Administrator/Customer_management/Enterprise_Information_Management/All_enterprise_information'
import Newenterprise from '@/views/Administrator/Customer_management/Enterprise_Information_Management/new_enterprise'
import Enterprise_specific_information from '@/views/Administrator/Customer_management/Enterprise_Information_Management/Enterprise_specific_information'
import Modifying_Enterprise_Information from '@/views/Administrator/Customer_management/Enterprise_Information_Management/Modifying_Enterprise_Information'
import Member_Information_Management from '@/views/Administrator/Customer_management/Enterprise_Information_Management/Member_Information_Management'

//系统管理
//角色管理
import new_role from '@/views/Administrator/System_management/Role_management/new_role'


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
            path:"WaitPut",
            component:WaitPut,
        },{
            path:"Newcommodity",
            component: Newcommodity
        },{
            path:"Issue",
            component:Issue
        },{
            path:"Issueredact",
            component:Issueredact
        },{
            path:"Unshelve",
            component:Unshelve
        },{
            path:"Sold",
            component:Sold
        },{
            path:"Orderall",
            component:Orderall
        },{
            path:"Waitpay",
            component:Waitpay
        },{
            path:"Waitship",
            component:Waitship
        },{
            path:"Waitrec",
            component:Waitrec
        },{
            path:"Iscompleted",
            component:Iscompleted
        },{
            path:"Isclose",
            component:Isclose
        },{
            path:"Allapply",
            component:Allapply
        },{
            path:"Newinvoice",
            component:Newinvoice
        },{
            path:"Waitdispose",
            component:Waitdispose
        },{
            path:"Isdispose",
            component:Isdispose
        },{
            path:"Commoditystatistics",
            component:Commoditystatistics
        },{
            path:"Classifiedstatistic",
            component:Classifiedstatistic
        },{
            path:"Storestatistics",
            component:Storestatistics
        },{
            path:"Accountmanagement",
            component:Accountmanagement
        },{
            path:"MoneManagement",
            component:MoneManagement
        },{
            path: "/",
            redirect: '/Main/WaitPut'
        }]
    }, {
        path: '/Admain',
        component: Admain,
        children:[{
            path:"Newenterprise",
            component:Newenterprise,
        },{
            path:"All_enterprise_information",
            component:All_enterprise_information,
        },{
            path:"Enterprise_specific_information",
            component:Enterprise_specific_information,
        },{
            path:"Modifying_Enterprise_Information",
            component:Modifying_Enterprise_Information,
        },{
            path:"Member_Information_Management",
            component:Member_Information_Management,
        },{
            path:"new_role",
            component:new_role,
        },]
    }, {
        path: "*",
        redirect: '/'
    }
    ]
});