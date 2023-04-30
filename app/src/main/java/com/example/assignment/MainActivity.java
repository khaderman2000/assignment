package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView periodic_table = findViewById(R.id.periodic_table);
        ImageView converter = findViewById(R.id.converter);
        ImageView pic3 = findViewById(R.id.pic3);
        ImageView pic4 = findViewById(R.id.pic4);


        periodic_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Converter.class);
                startActivity(intent);
            }
       });

        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

       pic4.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

            }
       });
    }
}