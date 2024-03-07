package com.example.latihan2.recycleview;

public class myItems {

    String name;
    String tipe;
    int img;

    public myItems(String name, String description, int img) {
        this.name = name;
        this.tipe = description;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
