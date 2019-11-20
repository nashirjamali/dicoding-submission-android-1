package com.example.motor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class listBuahAdapter extends RecyclerView.Adapter<listBuahAdapter.listViewHolder> {

    private ArrayList<buah> listbuah;
    Context context;

    public listBuahAdapter(Context context,ArrayList<buah> listbuah){
        this.listbuah = listbuah;
        this.context = context;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_buah, parent, false);
        return new listViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, final int position) {
        final buah b = listbuah.get(position);
        Glide.with(holder.itemView.getContext()).load(b.getGambar()).into(holder.gambar);
        holder.txt_buah.setText(b.getNama());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail(position);
            }

            private void detail(int position) {

                Intent intent = new Intent(context,detail_buahActivity.class);
                intent.putExtra("detail", position);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listbuah.size();
    }

    public class listViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar;
        TextView txt_buah;

        public listViewHolder(@NonNull View itemView) {
            super(itemView);

            gambar = itemView.findViewById(R.id.gmb_buah);
            txt_buah = itemView.findViewById(R.id.nm_buah);

        }
    }
}
