package com.mall.entity;

/*
@author 
@create 2021-07-30-8:06
*/


public class Car {
    private int carId;
    private String carAddress;
    private int carFlag;
    private Goods goods;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarAddress() {
        return carAddress;
    }

    public void setCarAddress(String carAddress) {
        this.carAddress = carAddress;
    }

    public int getCatFlag() {
        return carFlag;
    }

    public void setCatFlag(int catFlag) {
        this.carFlag = catFlag;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carAddress=" + carAddress +
                ", catFlag=" + carFlag +
                ", goods=" + goods +
                '}';
    }
}
