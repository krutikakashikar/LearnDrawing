package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BasicImage extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView text,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;


    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.basicimage);
        text=(TextView)findViewById(R.id.textView8);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(BasicImage.this,Chick.class);
                startActivity(ob);
                finish();
            }
        });
        text1=(TextView)findViewById(R.id.textView9);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1=new Intent(BasicImage.this,Rose.class);
                startActivity(ob1);
                finish();
            }
        });
        text2=(TextView)findViewById(R.id.textView10);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2=new Intent(BasicImage.this,Squirrel.class);
                startActivity(ob2);
                finish();
            }
        });
        text3=(TextView)findViewById(R.id.textView11);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3=new Intent(BasicImage.this,Bear.class);
                startActivity(ob3);
                finish();
            }
        });
        text4=(TextView)findViewById(R.id.textView12);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4=new Intent(BasicImage.this,Bird.class);
                startActivity(ob4);
                finish();
            }
        });

        text5=(TextView)findViewById(R.id.textView13);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob5=new Intent(BasicImage.this,Bat.class);
                startActivity(ob5);
                finish();
            }
        });
        text6=(TextView)findViewById(R.id.textView14);
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob6=new Intent(BasicImage.this,Rose1.class);
                startActivity(ob6);
                finish();
            }
        });
        text7=(TextView)findViewById(R.id.textView15);
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob7=new Intent(BasicImage.this,Giraffe.class);
                startActivity(ob7);
                finish();
            }
        });
        text8=(TextView)findViewById(R.id.textView16);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob8=new Intent(BasicImage.this,Elephent.class);
                startActivity(ob8);
                finish();
            }
        });
        text9=(TextView)findViewById(R.id.textView17);
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob9=new Intent(BasicImage.this,Polobear.class);
                startActivity(ob9);
                finish();
            }
        });






        imageView = (ImageView) findViewById(R.id.imageView24);
        imageView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent ob10 = new Intent(BasicImage.this, LearnDrawing2.class);
        startActivity(ob10);

        finish();
        }
        });
        }


        }

