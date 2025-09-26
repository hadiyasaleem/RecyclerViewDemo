package com.example.recyclerviewdemo.DemoONE;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;

import java.util.Arrays;

public class AdapterOne extends RecyclerView.Adapter<AdapterOne.MyViewHolder>
{
    int[] arr_img;
    String[] arr_names;
    public AdapterOne(int[]arr_img ,String[] arr_names){
        this.arr_img=arr_img;
        this.arr_names=arr_names;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recyclerview_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img.setImageResource(arr_img[position]);
        holder.names.setText(arr_names[position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView names;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.image_one);
            names=(TextView) itemView.findViewById(R.id.tv_one);
        }
    }
}
