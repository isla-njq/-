package com.mall.Service;

import com.mall.entity.Car;

import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-08-02-15:35
*/
@Service
public interface ICarService {
    List<Car> list();
    Car find(Integer carId);
    int insert(Car car);
    int update(Car car);
}
