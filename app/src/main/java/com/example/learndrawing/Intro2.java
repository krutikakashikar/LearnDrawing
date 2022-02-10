package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Intro2 extends AppCompatActivity
{
    private static int splash_time_out=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hIntent = new Intent(Intro2.this, Intro3.class);
                startActivity(hIntent);
                finish();
            }

        },splash_time_out);

    }
}
