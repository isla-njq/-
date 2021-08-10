package com.mall.Mapper;

import com.mall.entity.Goods;
import com.mall.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-07-25-15:19
*/
@Mapper
public interface OrdersMapper {
    List<Orders>findAll();
    Orders find(Integer ordersId);
    int doAdd(Orders orders);
    int doUpdate(Orders orders);
}
