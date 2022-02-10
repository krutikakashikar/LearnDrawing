package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PortraitImage  extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView text25,text26,text27,text28,text29,text30,text31,text32,text33,text34,text35;

    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.portraitimage);

        text25=(TextView)findViewById(R.id.textView34);
        text25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch1.class);
                startActivity(ob);
                finish();
            }
        });
        text26=(TextView)findViewById(R.id.textView35);
        text26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch2.class);
                startActivity(ob);
                finish();
            }
        });
        text27=(TextView)findViewById(R.id.textView36);
        text27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch3.class);
                startActivity(ob);
                finish();
            }
        });
        text28=(TextView)findViewById(R.id.textView37);
        text28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch4.class);
                startActivity(ob);
                finish();
            }
        });
        text29=(TextView)findViewById(R.id.textView38);
        text29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch5.class);
                startActivity(ob);
                finish();
            }
        });
        text30=(TextView)findViewById(R.id.textView39);
        text30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch6.class);
                startActivity(ob);
                finish();
            }
        });
        text31=(TextView)findViewById(R.id.textView40);
        text31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch7.class);
                startActivity(ob);
                finish();
            }
        });
        text32=(TextView)findViewById(R.id.textView41);
        text32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch8.class);
                startActivity(ob);
                finish();
            }
        });
        text33=(TextView)findViewById(R.id.textView42);
        text33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch9.class);
                startActivity(ob);
                finish();
            }
        });
        text34=(TextView)findViewById(R.id.textView43);
        text34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch10.class);
                startActivity(ob);
                finish();
            }
        });
        text35=(TextView)findViewById(R.id.textView44);
        text35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(PortraitImage.this,Sketch11.class);
                startActivity(ob);
                finish();
            }
        });





        imageView = (ImageView) findViewById(R.id.imageView27);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(PortraitImage.this, LearnDrawing2.class);
                startActivity(ob);

                finish();
            }
        });
    }


}







