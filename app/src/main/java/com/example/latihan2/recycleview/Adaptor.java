package com.example.latihan2.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihan2.R;

import org.w3c.dom.Text;

import java.util.List;

public class Adaptor extends RecyclerView.Adapter<Adaptor.ViewHolder> {

    private Context context;
    private List<itemsme> items;
    private ItemClickListener itemClickListener;

    public Adaptor(Context context, List<itemsme> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycl, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        itemsme currentItem = items.get(position);
        holder.nama.setText(currentItem.name);
        holder.tipe.setText(currentItem.getTipe());
        holder.imageVW.setImageResource(currentItem.getImg());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nama;
        TextView tipe;
        ImageView imageVW;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.name);
            tipe = itemView.findViewById(R.id.tipe);
            imageVW = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemClickListener != null) {
                itemClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
