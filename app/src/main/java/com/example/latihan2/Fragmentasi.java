package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.latihan2.fragmentasi.frg1;
import com.example.latihan2.fragmentasi.frg2;

public class Fragmentasi extends AppCompatActivity {
    Button frgmnt1,frgmnt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frgmnts);
        frgmnt1 = findViewById(R.id.frgmnt1);
        frgmnt2 = findViewById(R.id.frgmnt2);

        frgmnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFrag(new frg1());
            }
        });
        frgmnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFrag(new frg2());
            }
        });

    }
    private void replaceFrag(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FramLay,fragment);
        fragmentTransaction.commit();
    }
}