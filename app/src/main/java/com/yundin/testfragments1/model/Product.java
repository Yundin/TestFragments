package com.yundin.testfragments1.model;

/**
 * Created by vladislav on 01.12.16.
 */
public class Product {

    private String name;
    private String price;
    private Integer pic;

    public Product(String name, String price, Integer pic) {
        this.name = name;
        this.price = price;
        this.pic = pic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }
}
