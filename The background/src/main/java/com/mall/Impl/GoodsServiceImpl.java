package com.mall.Impl;


import com.mall.Mapper.GoodsMapper;
import com.mall.Service.IGoodsService;
import com.mall.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

/*
@author 
@create 2021-07-19-13:21
*/
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods>list(){
        return goodsMapper.findAll();
    }
    @Override
    public Goods find(Integer goodsId){
        return goodsMapper.find(goodsId);
    }
    @Override
    public int insert(Goods goods){
        return goodsMapper.doAdd(goods);
    }
    @Override
    public int update(Goods goods){
        return goodsMapper.doUpdate(goods);
    }
    @Override
    public List<Goods>storesgoods(Integer storesId){
        return goodsMapper.findstoresgoods(storesId);
    }
}
