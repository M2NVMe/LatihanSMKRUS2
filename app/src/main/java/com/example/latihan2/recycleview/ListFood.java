package com.example.latihan2.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.latihan2.R;

import java.util.ArrayList;
import java.util.List;


public class ListFood extends AppCompatActivity implements SelectListen{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_makanan);

        RecyclerView recyclerView = findViewById(R.id.recycl);
        List<myItems> Barang = new ArrayList<myItems>();
        Barang.add(new myItems("Kentang Goreng", " Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas disebut French fries. ", "https://www.recipetineats.com/wp-content/uploads/2022/09/Fries-with-rosemary-salt_1.jpg"));
       Barang.add(new myItems("Mendoan", " Mendoan (mêndoan) adalah penganan sejenis gorengan yang terbuat dari tempe yang dibaluri tepung dan daun bawang lalu dimasak setengah matang. Kata mendoan sendiri berasal dari bahasa Jawa, yaitu mendo yang berarti setengah matang atau lembek.", "https://cdn0-production-images-kly.akamaized.net/BZEugf59gI9pIGIx-_mtGG3fcOM=/800x1066/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2553515/original/074231800_1545367498-capture-20181221-114133.jpg"));
       Barang.add(new myItems("Pizza", " Piza[1] (bahasa Italia: pizza) adalah hidangan gurih asal Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih sesuai selera. Keju yang dipakai biasanya mozzarella atau keju piza, bisa juga parmesan dan beberapa jenis keju lainnya. ", "https://www.foodandwine.com/thmb/Wd4lBRZz3X_8qBr69UOu2m7I2iw=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/classic-cheese-pizza-FT-RECIPE0422-31a2c938fc2546c9a07b7011658cfd05.jpg"));
       Barang.add(new myItems("Lontong Tahu Telor", " Adalah Sebuah hidangan yang dimana lontong sebagai bagian utama hidangannya yang di temani oleh telur dan tahu, biasanya berasa manis dan di campuur dengan sambel kacang yang manis maupun pedas", "https://i0.wp.com/resepkoki.id/wp-content/uploads/2021/09/Resep-Tahu-Telur.jpg?fit=1560%2C1496&ssl=1"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adaptor(getApplicationContext(),Barang, this));
    }

    @Override
    public void itemklik(myItems holding) {
        Toast.makeText(this, holding.getName(), Toast.LENGTH_SHORT).show();
    }
}