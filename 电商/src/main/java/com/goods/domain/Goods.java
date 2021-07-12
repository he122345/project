package com.goods.domain;

public class Goods {
    private int id;
    private String Name;
    private int price;

    public Goods() {
    }

    public Goods(int id, String name, int price) {
        this.id = id;
        this.Name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "goods{" +
                "id=" + id +
                ", name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
