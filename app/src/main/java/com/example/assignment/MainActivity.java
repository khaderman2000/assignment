package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation main_animation, buttom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        main_animation= AnimationUtils.loadAnimation(this, R.anim.main_animation);
        buttom_animation = AnimationUtils.loadAnimation(this, R.anim.title_animation);
        ImageView periodic_table = findViewById(R.id.periodic_table);
        ImageView converter = findViewById(R.id.converter);
        ImageView chemistry = findViewById(R.id.chemistry);
        ImageView physics = findViewById(R.id.physics);
        ImageView tasks = findViewById(R.id.tasks);
        TextView title = findViewById(R.id.title);
        periodic_table.setAnimation(main_animation);
        converter.setAnimation(main_animation);
        chemistry.setAnimation(main_animation);
        physics.setAnimation(main_animation);
        tasks.setAnimation(main_animation);
        title.setAnimation(buttom_animation);

        periodic_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PeriodicTable.class);
                startActivity(intent);
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