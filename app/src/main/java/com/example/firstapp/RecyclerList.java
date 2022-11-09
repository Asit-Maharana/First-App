package com.example.firstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        RecyclerView list=findViewById(R.id.List);
        list.setLayoutManager(new LinearLayoutManager(this));
        List<Data> data = listData();
        RecycleAdapter adapter = new RecycleAdapter(data, getApplication());
        list.setAdapter(adapter);

    }
    public List<Data> listData() {

        List<Data> data = new ArrayList<>();
        data.add(new Data("C", R.drawable.c));
        data.add(new Data("C++", R.drawable.cc));
        data.add(new Data("Java", R.drawable.java));
        data.add(new Data("Android", R.drawable.android));
        data.add(new Data("Kotlin", R.drawable.kotlin));
        data.add(new Data("Html", R.drawable.html));
        data.add(new Data("CSS", R.drawable.css));
        data.add(new Data("JavaScript", R.drawable.js));
        data.add(new Data("MySQL", R.drawable.sql));
        data.add(new Data("Bootstrap", R.drawable.bootstrap));
        data.add(new Data("Angular", R.drawable.angular));
        data.add(new Data("Oracle", R.drawable.oracle));
        data.add(new Data("JSP", R.drawable.jsp));
        return data;
    }
}
