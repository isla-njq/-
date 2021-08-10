package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.ICategoryService;
import com.mall.Service.IOrdersService;
import com.mall.entity.Category;
import com.mall.entity.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-07-25-15:26
*/

@RequestMapping("/admin/orders")
@Controller


public class AdminOrdersController {
    @Resource
    private IOrdersService ordersService;


    /*@RequestMapping("/list")
    public String list(Model model){
        List<Orders> ordersList = ordersService.list();
        model.addAttribute("ordersList",ordersList);
        return "/admin/orders_list";
    }*/
    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Orders> ordersList = ordersService.list();
        model.addAttribute("ordersList",ordersList);
        String str = mapper.writeValueAsString(model);
        return str;
    }

    /*@RequestMapping("/add_show")
    public String add_show(Model model){
        List<Orders> ordersList = ordersService.list();
        model.addAttribute("ordersList",ordersList);
        return "/admin/order_add";
    }*/
    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Orders> ordersList = ordersService.list();
        model.addAttribute("ordersList",ordersList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    /*@RequestMapping("/add_submit")
    public String add_submit(Orders orders){
        ordersService.insert(orders);
        return "redirect:/admin/orders/list";
    }*/
    @RequestMapping(value = "/add_submit" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Orders orders) throws JsonProcessingException{
        ordersService.insert(orders);
        ObjectMapper mapper = new ObjectMapper();
        List<Orders> ordersList = ordersService.list();
        String str = mapper.writeValueAsString(ordersList);
        return str;
    }


    /*@RequestMapping("/update_show")
    public String update_show(Integer ordersId,Model model){
        Orders orders = ordersService.find(ordersId);
        model.addAttribute("orders",orders);
        return "/admin/order_update";
    }*/
    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer ordersId,Model model)throws JsonProcessingException{
        Orders orders = ordersService.find(ordersId);
        model.addAttribute("orders",orders);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }

    /*@RequestMapping("/update_submit")
    public String update_submit(Orders orders){
        ordersService.update(orders);
        return "redirect:/admin/orders/list";
    }*/
    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Orders orders)throws JsonProcessingException{
        ordersService.update(orders);
        ObjectMapper mapper = new ObjectMapper();
        List<Orders> ordersList=ordersService.list();
        String str =mapper.writeValueAsString(ordersList);
        return str;
    }
}
