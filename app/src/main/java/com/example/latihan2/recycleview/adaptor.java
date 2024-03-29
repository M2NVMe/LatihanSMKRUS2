package com.example.latihan2.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.latihan2.R;

import java.util.List;

public class adaptor extends RecyclerView.Adapter<vwhld> {

    Context konteks;
    List<myItems> item;
    SelectListen selectListen;

    public adaptor(Context konteks, List<myItems> item, SelectListen selectListen) {
        this.konteks = konteks;
        this.item = item;
        this.selectListen = selectListen;
    }

    @NonNull
    @Override
    public vwhld onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new vwhld(LayoutInflater.from(konteks).inflate(R.layout.item_recycl,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull vwhld holder, @SuppressLint("RecyclerView") int position) {
        holder.nama.setText(item.get(position).getName());
        holder.tipe.setText(item.get(position).getTipe());
        Glide.with(holder.itemView.getContext()).load(item.get(position).getImg()).into(holder.ImageVW);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectListen.itemklik(item.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }


}
