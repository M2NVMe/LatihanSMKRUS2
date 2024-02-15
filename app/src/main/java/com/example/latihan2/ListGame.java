package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class ListGame extends AppCompatActivity {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    String Name;
    String Jenis;
    int img;
    public ListGame(String Name, String Jenis, int img) {
        this.Name = Name;
        this.Jenis = Jenis;
        this.img = img;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_game);
    }
}