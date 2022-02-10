package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThreeDImage extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView text36,text37,text38,text39,text40,text41,text42,text43,text44,text45;

    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.threedimage);


        text36=(TextView)findViewById(R.id.textView46);
        text36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Star.class);
                startActivity(ob);
                finish();
            }
        });
        text37=(TextView)findViewById(R.id.textView47);
        text37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Triangle.class);
                startActivity(ob);
                finish();
            }
        });
        text38=(TextView)findViewById(R.id.textView48);
        text38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,StepsIllusions.class);
                startActivity(ob);
                finish();
            }
        });
        text39=(TextView)findViewById(R.id.textView49);
        text39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Ladder.class);
                startActivity(ob);
                finish();
            }
        });
        text40=(TextView)findViewById(R.id.textView50);
        text40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Hole.class);
                startActivity(ob);
                finish();
            }
        });
        text41=(TextView)findViewById(R.id.textView51);
        text41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Stairway.class);
                startActivity(ob);
                finish();
            }
        });
        text42=(TextView)findViewById(R.id.textView52);
        text42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,GlassBall.class);
                startActivity(ob);
                finish();
            }
        });
        text43=(TextView)findViewById(R.id.textView53);
        text43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Butterfly.class);
                startActivity(ob);
                finish();
            }
        });
        text44=(TextView)findViewById(R.id.textView54);
        text44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,BigBuilding.class);
                startActivity(ob);
                finish();
            }
        });
        text45=(TextView)findViewById(R.id.textView55);
        text45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ThreeDImage.this,Hand3d.class);
                startActivity(ob);
                finish();
            }
        });
























        imageView = (ImageView) findViewById(R.id.imageView39);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(ThreeDImage.this,LearnDrawing2.class);
                startActivity(ob);

                finish();
            }
        });
    }


}




