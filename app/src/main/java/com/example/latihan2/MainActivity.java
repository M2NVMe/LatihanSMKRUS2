package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtuser;
    EditText txtpawos;
    Button btnlogin;
    Button btnregist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);

        //connect variable widget komponen ke layout
        txtuser = findViewById(R.id.txtUSRN);
        txtpawos = findViewById(R.id.tstPWS);
        btnlogin = findViewById(R.id.btnLGN);
        btnregist = findViewById(R.id.btnRGR);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            String user = "Bumi";
            String pw = "Bagus";
            @Override
            public void onClick(View view) {
                if (txtuser.getText().toString().equals(user) && txtpawos.getText().toString().equals(pw)) {
                    Intent intent = new Intent(MainActivity.this, kalkulator.class) ;
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}