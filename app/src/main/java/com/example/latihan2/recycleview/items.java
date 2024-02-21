package com.example.latihan2.recycleview;

public class items {

    String name;
    String tipe;
    int img;

    public items(String name, String tipe, int img) {
        this.name = name;
        this.tipe = tipe;
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
