package com.example.latihan2.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.latihan2.R;

import java.util.ArrayList;
import java.util.List;


public class ListFood extends AppCompatActivity implements Adaptor.ItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_makanan);

        RecyclerView recyclerView = findViewById(R.id.recycl);
        List<itemsme> Barang = new ArrayList<itemsme>();
        Barang.add(new itemsme("Kentang Goreng", " Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas disebut French fries. ", R.drawable.j2prime));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adaptor(getApplicationContext(),Barang));
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + Adaptor.items(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}