package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {
    EditText angka1;
    EditText angka2;
    Spinner spining;
    Button kalkulasi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        spining = findViewById(R.id.spinnergajelas);
        kalkulasi = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        kalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wauw = spining.getSelectedItem().toString();
                //ga bisa langsung, harus di parse dulu terus ambil textnya lalu tujuin ke stringnya (inget inget)
                //intinya seperti scanner namun di dalam textbox yang bentuknya string, lalu di parse
                float num1 = Float.parseFloat(angka1.getText().toString());
                float num2 = Float.parseFloat(angka2.getText().toString());
                float hsl = 0;

                switch (wauw) {
                    case "Tambah":
                        hsl = num1 + num2;
                        break;
                    case "Kurang":
                        hsl = num1 - num2;
                        break;
                    case "Kali":
                        hsl = num1 * num2;
                        break;
                    case "Bagi":
                        hsl = num1 / num2;
                        break;
                }
                //harus ada semacam penunjuk valueof(hsl), ga bisa langsung seperti java netbeans
                hasil.setText(String.valueOf(hsl));
            }
            //ini cuma test, moga gk ngebug
        });
    }
}