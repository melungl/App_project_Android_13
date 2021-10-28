package com.example.firbasevideosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class VideosActivity extends AppCompatActivity {

    //UI views
    FloatingActionButton addVideosBtn;
    Button activate_Unity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        //change actionbar title
        setTitle("Videos");



        //init UI Views
        addVideosBtn = findViewById(R.id.addVideosBtn);
        activate_Unity = findViewById(R.id.activate_Unity);
        //handle click
        addVideosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //start activity to add videos
                startActivity(new Intent(VideosActivity.this, AddVideoActivity.class));
            }
        });

        activate_Unity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideosActivity.this, UnityPlayerActivity.class));
            }
        });

    }
}