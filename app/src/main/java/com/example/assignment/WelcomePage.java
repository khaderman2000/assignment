package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {
    Animation welcome_animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setVisibility(View.GONE);
        welcome_animation= AnimationUtils.loadAnimation(this, R.anim.welcome_animation);
        textView.startAnimation(welcome_animation);
        Handler anim_handler = new Handler();
        anim_handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView2.startAnimation(welcome_animation);
                textView2.setVisibility(View.VISIBLE);
            }
        }, 2000);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomePage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}