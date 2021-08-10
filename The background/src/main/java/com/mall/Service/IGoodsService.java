package com.mall.Service;

import com.mall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/*
@author
@create 2021-07-19-13:19
*/
@Service
public interface IGoodsService {
    List<Goods>list();
    Goods find(Integer goods);
    int insert(Goods goods);
    int update(Goods goods);
    List<Goods>storesgoods(Integer storesId);
}
