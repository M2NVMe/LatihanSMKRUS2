package com.example.latihan2.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihan2.R;

import org.w3c.dom.Text;

public class viewholder extends RecyclerView.ViewHolder {
    ImageView ImageVW;
    TextView nama,tipe;
    public viewholder(@NonNull View itemView) {
        super(itemView);
        ImageVW = itemView.findViewById(R.id.ImageVW);
        nama = itemView.findViewById(R.id.name);
        tipe = itemView.findViewById(R.id.tipe);

    }
}
