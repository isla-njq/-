package com.mall.Mapper;

import com.mall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-07-19-12:58
*/

@Mapper
public interface GoodsMapper {
    List<Goods>findAll();
    Goods find(Integer goodsId);
    int doAdd(Goods goods);
    int doUpdate(Goods goods);
    List<Goods>findstoresgoods(Integer storesId);
}
