package com.mall.Impl;

import com.mall.Mapper.CategoryMapper;
import com.mall.Mapper.OrdersMapper;
import com.mall.Service.IOrdersService;
import com.mall.entity.Category;
import com.mall.entity.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-07-25-15:23
*/
@Service
public class OrdersServiceImpl implements IOrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> list(){
        return ordersMapper.findAll();
    }
    @Override
    public int insert(Orders orders){
        return ordersMapper.doAdd(orders);
    }
    @Override
    public Orders find(Integer ordersId){
        return ordersMapper.find(ordersId);
    }
    @Override
    public int update(Orders orders){
        return ordersMapper.doUpdate(orders);
    }
}
