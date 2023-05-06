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
        ImageView chemistry = findViewById(R.id.chemistry);
        ImageView physics = findViewById(R.id.physics);
        ImageView tasks = findViewById(R.id.tasks);


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
        tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tasks.class );
                startActivity(intent);
            }
        });


        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

       physics.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

            }
       });
    }
}