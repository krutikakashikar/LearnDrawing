package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch6 extends AppCompatActivity
{
    private Button button63,button64;
    private ImageSwitcher switch29;
    ImageView imageView;
    private int[]images={R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,
            R.drawable.m5,R.drawable.m6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch6);
        button63 = (Button)findViewById(R.id.button63);
        button64 = (Button) findViewById(R.id.button64);
        switch29 = (ImageSwitcher) findViewById(R.id.switch29);
        switch29.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch6.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch29.setInAnimation(this,android.R.anim.slide_in_left);
        switch29.setOutAnimation(this,android.R.anim.slide_out_right);
        button63.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch29.setImageResource(images[position]);
            }

        });
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch29.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView70);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch6.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

