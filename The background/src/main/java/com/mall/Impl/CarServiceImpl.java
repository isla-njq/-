package com.mall.Impl;

/*
@author 
@create 2021-08-02-15:34
*/


import com.mall.Mapper.CarMapper;
import com.mall.Service.ICarService;
import com.mall.entity.Car;

import org.apache.catalina.Store;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    @Resource
    private CarMapper carMapper;
    @Override
    public List<Car> list(){return carMapper.findAll();}
    @Override
    public int insert(Car car){return carMapper.doAdd(car);}
    @Override
    public Car find(Integer carId){return carMapper.find(carId);}
    @Override
    public int update(Car car){return carMapper.doUpdate(car);}

}
