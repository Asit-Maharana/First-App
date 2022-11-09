package com.example.firstapp;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ListViewHolder> {
    Context context;
    List<Data> list = Collections.emptyList();
    public RecycleAdapter(List<Data> data, Application application){
        this.list=data;
        this.context=application;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.name.setText(list.get(position).name);
        holder.imgIcon.setImageResource(list.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListViewHolder  extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView name;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon= (ImageView)itemView.findViewById(R.id.imgIcon);
            name=(TextView)itemView.findViewById(R.id.textTitle);

        }
    }
}
