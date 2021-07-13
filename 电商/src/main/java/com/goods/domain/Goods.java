package com.goods.domain;

public class Goods {
    private int id;
    private String Name;
    private int price;
    private String Image;

    public Goods() {
    }

    public Goods(int id, String name, int price, String image) {
        this.id = id;
        Name = name;
        this.price = price;
        Image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                ", Image='" + Image + '\'' +
                '}';
    }
}
