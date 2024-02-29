package com.example.latihan2.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.latihan2.R;

import java.util.ArrayList;
import java.util.List;


public class ListFood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_makanan);

        RecyclerView recyclerView = findViewById(R.id.recycl);
        List<itemsme> Barang = new ArrayList<itemsme>();
        Barang.add(new itemsme("Kentang Goreng", " Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas disebut French fries. ", R.drawable.j2prime));
       Barang.add(new itemsme("Mendoan", " Mendoan (mêndoan) adalah penganan sejenis gorengan yang terbuat dari tempe yang dibaluri tepung dan daun bawang lalu dimasak setengah matang. Kata mendoan sendiri berasal dari bahasa Jawa, yaitu mendo yang berarti setengah matang atau lembek.", R.drawable.mendoan));
       Barang.add(new itemsme("Pizza", " Piza[1] (bahasa Italia: pizza) adalah hidangan gurih asal Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih sesuai selera. Keju yang dipakai biasanya mozzarella atau keju piza, bisa juga parmesan dan beberapa jenis keju lainnya. ", R.drawable.piza));
       Barang.add(new itemsme("Lontong Tahu Telor", " Adalah Sebuah hidangan yang dimana lontong sebagai bagian utama hidangannya yang di temani oleh telur dan tahu, biasanya berasa manis dan di campuur dengan sambel kacang yang manis maupun pedas", R.drawable.tahutelor));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adaptor(getApplicationContext(),Barang));
    }
}