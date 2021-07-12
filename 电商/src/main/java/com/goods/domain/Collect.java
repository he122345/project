package com.goods.domain;

public class Collect {
    private String userName;
    private String goodsName;

    public Collect() {
    }

    public Collect(String userName, String goodsName) {
        this.userName = userName;
        this.goodsName = goodsName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "collect{" +
                "userName='" + userName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                '}';
    }
}
