package com.mall.Service;

import com.mall.entity.Category;
import com.mall.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-07-25-15:27
*/
@Service
public interface IOrdersService {
    List<Orders> list();
    Orders find(Integer ordersId);
    int insert(Orders orders);
    int update(Orders orders);
}
