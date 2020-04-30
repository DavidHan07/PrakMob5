package com.example.prak5_145;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.prak5_145.adapter.CustomHomeAdapter;
import com.example.prak5_145.model.dataHome;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ArrayList<dataHome> data;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.rv_judul);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        data.add(new dataHome("gas_station", "SPBU"));
        data.add(new dataHome("restaurant", "Restoran"));
        data.add(new dataHome("police", "Kantor Polisi"));
        data.add(new dataHome("park", "Tempat Wisata"));
        data.add(new dataHome("school", "Sekolah"));
        data.add(new dataHome("local_government_office", "Kantor Pemerintah"));



        adapter = new CustomHomeAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}
