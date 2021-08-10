package com.mall.Impl;

import com.mall.Mapper.StoresMapper;
import com.mall.Service.IStoresService;
import com.mall.entity.Stores;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-08-02-9:02
*/
@Service
public class StoresServiceImpl implements IStoresService {
    @Resource
    private StoresMapper storesMapper;
    @Override
    public List<Stores> list(){return storesMapper.findAll();}
    @Override
    public int insert(Stores stores){return storesMapper.doAdd(stores);}
    @Override
    public Stores find(Integer storesId){return storesMapper.find(storesId);}
    @Override
    public int update(Stores stores){return storesMapper.doUpdate(stores);}
}
