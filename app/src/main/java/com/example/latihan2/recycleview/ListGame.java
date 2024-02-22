package com.example.latihan2.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.latihan2.R;

import java.util.ArrayList;
import java.util.List;


public class ListGame extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_game);

        RecyclerView recyclerView = findViewById(R.id.recycl);
        List<itemsme> Barang = new ArrayList<itemsme>();
        Barang.add(new itemsme("Derail Valley", "Simulation", R.drawable.wauw));
        Barang.add(new itemsme("Gmod", "Sandbox", R.drawable.gm));
        Barang.add(new itemsme("HL2", "Adventure", R.drawable.hl2));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adaptor(getApplicationContext(),Barang));
    }
}