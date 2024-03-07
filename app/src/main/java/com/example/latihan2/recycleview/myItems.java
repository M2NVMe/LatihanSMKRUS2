package com.example.latihan2.recycleview;

public class myItems {

    String name;
    String tipe;
    String img;

    public myItems(String name, String description, String img) {
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
