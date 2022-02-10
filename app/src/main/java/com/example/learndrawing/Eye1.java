package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Eye1 extends AppCompatActivity
{
    private Button button49,button50;
    private ImageSwitcher switch22;
    ImageView imageView;
    private int[]images={R.drawable.eye10,R.drawable.eye20,R.drawable.eye30,R.drawable.eye40,R.drawable.eye50,
            R.drawable.eye60,R.drawable.eye70,R.drawable.eye80,R.drawable.eye90,R.drawable.eye100,
            R.drawable.eye110,R.drawable.eye120,R.drawable.eye130,R.drawable.eye140,R.drawable.eye150,
            R.drawable.eye160,R.drawable.eye170,R.drawable.eye180,R.drawable.eye190,R.drawable.eye200};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eye1);
        button49= (Button)findViewById(R.id.button49);
        button50 = (Button) findViewById(R.id.button50);
        switch22 = (ImageSwitcher) findViewById(R.id.switch22);
        switch22.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Eye1.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch22.setInAnimation(this,android.R.anim.slide_in_left);
        switch22.setOutAnimation(this,android.R.anim.slide_out_right);
        button49.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch22.setImageResource(images[position]);
            }

        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch22.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView63);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Eye1.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

