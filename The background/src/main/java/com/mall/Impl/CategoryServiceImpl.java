package com.mall.Impl;

import com.mall.Mapper.CategoryMapper;
import com.mall.Mapper.GoodsMapper;
import com.mall.Service.ICategoryService;
import com.mall.entity.Category;
import com.mall.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-07-22-16:53
*/
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category>list(){
        return categoryMapper.findAll();
    }
    @Override
    public int insert(Category category){
        return categoryMapper.doAdd(category);
    }
    @Override
    public Category find(Integer categoryId){
        return categoryMapper.find(categoryId);
    }
    @Override
    public int update(Category category){
        return categoryMapper.doUpdate(category);
    }

    @Override
    public List<Category>LevelList(Integer categoryLevel){ return categoryMapper.findLevel(categoryLevel); }

    @Override
    public List<Category>SonList(Integer parentId){ return categoryMapper.findSon(parentId);}
    @Override
    public List<Category>GrandSon(Category category){ return categoryMapper.findGrandSon(category);}
}
