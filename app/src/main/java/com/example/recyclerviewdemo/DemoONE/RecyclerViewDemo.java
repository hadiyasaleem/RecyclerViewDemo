package com.example.recyclerviewdemo.DemoONE;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;

public class RecyclerViewDemo extends AppCompatActivity {
    RecyclerView recyclerview_one;
    String[] names={"Hadia","Laraib","Sharfa","Aliyan"};
    int[] img={R.drawable.hijab_jpg,R.drawable.cloud,R.drawable.nature,R.drawable.mountain};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view_demo);

        recyclerview_one=(RecyclerView) findViewById(R.id.recyclerview_one);
        AdapterOne adapterOne=new AdapterOne(img,names);

        recyclerview_one.setLayoutManager(new LinearLayoutManager(this));
        recyclerview_one.setAdapter(adapterOne);


    }
}