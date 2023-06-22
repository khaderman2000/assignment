package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;

import com.google.gson.Gson;

import adepters.ElementAdapter;
import models.Element;

public class PeriodicTable extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table);

        Gson gson = new Gson();
        Resources resources = getResources();
        TypedArray jsonElements = resources.obtainTypedArray(R.array.periodic_table);
        Element[] elements = new Element[jsonElements.length()];

        RecyclerView periodic_table_recyclerView;

        for (int i = 0; i < jsonElements.length(); i++) {
            String jsonString = jsonElements.getString(i);
            Element element = gson.fromJson(jsonString, Element.class);
            elements[i] = element;
        }
        periodic_table_recyclerView = findViewById(R.id.periodic_table_recyclerView);
        periodic_table_recyclerView.setHasFixedSize(true);
        periodic_table_recyclerView.setLayoutManager(new StaggeredGridLayoutManager(
                1, StaggeredGridLayoutManager.VERTICAL));
        ElementAdapter elementAdapter = new ElementAdapter(elements, this);
        periodic_table_recyclerView.setAdapter(elementAdapter);

    }
}