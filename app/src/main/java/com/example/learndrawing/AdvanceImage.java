package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdvanceImage extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView text11,text12,text13,text14,text15,text16,text17,
            text18,text19,text20,text21,text22,text23,text24;

    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.advanceimages);

        text11=(TextView)findViewById(R.id.textView19);
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Face1.class);
                startActivity(ob);
                finish();
            }
        });
        text12=(TextView)findViewById(R.id.textView20);
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Face2.class);
                startActivity(ob);
                finish();
            }
        });
        text13=(TextView)findViewById(R.id.textView21);
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Situation.class);
                startActivity(ob);
                finish();
            }
        });
        text14=(TextView)findViewById(R.id.textView22);
        text14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,HairStyle.class);
                startActivity(ob);
                finish();
            }
        });
        text15=(TextView)findViewById(R.id.textView23);
        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Ear.class);
                startActivity(ob);
                finish();
            }
        });
        text16=(TextView)findViewById(R.id.textView24);
        text16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Eye.class);
                startActivity(ob);
                finish();
            }
        });
        text17=(TextView)findViewById(R.id.textView25);
        text17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Feat.class);
                startActivity(ob);
                finish();
            }
        });
        text18=(TextView)findViewById(R.id.textView26);
        text18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Leg.class);
                startActivity(ob);
                finish();
            }
        });
        text19=(TextView)findViewById(R.id.textView27);
        text19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Hand.class);
                startActivity(ob);
                finish();
            }
        });

        text20=(TextView)findViewById(R.id.textView28);
        text20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Face3.class);
                startActivity(ob);
                finish();
            }
        });

        text21=(TextView)findViewById(R.id.textView29);
        text21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Eye1.class);
                startActivity(ob);
                finish();
            }
        });
        text22=(TextView)findViewById(R.id.textView30);
        text22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Face4.class);
                startActivity(ob);
                finish();
            }
        });
        text23=(TextView)findViewById(R.id.textView31);
        text23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Nose.class);
                startActivity(ob);
                finish();
            }
        });
        text24=(TextView)findViewById(R.id.textView32);
        text24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(AdvanceImage.this,Lips.class);
                startActivity(ob);
                finish();
            }
        });



        imageView = (ImageView) findViewById(R.id.imageView25);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(AdvanceImage.this,LearnDrawing2.class);
                startActivity(ob);
                finish();
            }
        });
    }


}



