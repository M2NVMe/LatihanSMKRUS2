package com.example.latihan2.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihan2.R;

import java.util.List;

public class adaptor extends RecyclerView.Adapter<viewholder> {

    Context konteks;
    List<itemsme> item;

    public adaptor(Context konteks, List<itemsme> item) {
        this.konteks = konteks;
        this.item = item;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholder(LayoutInflater.from(konteks).inflate(R.layout.item_recycl,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.nama.setText(item.get(position).getName());
        holder.tipe.setText(item.get(position).getTipe());
        holder.ImageVW.setImageResource(item.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
