package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Leg extends AppCompatActivity
{
    private Button button39,button40;
    private ImageSwitcher switch17;
    ImageView imageView;
    private int[]images={R.drawable.legs21,R.drawable.legs22,R.drawable.legs23};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg);
        button39= (Button)findViewById(R.id.button39);
        button40 = (Button) findViewById(R.id.button40);
        switch17 = (ImageSwitcher) findViewById(R.id.switch17);
        switch17.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Leg.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch17.setInAnimation(this,android.R.anim.slide_in_left);
        switch17.setOutAnimation(this,android.R.anim.slide_out_right);
        button39.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch17.setImageResource(images[position]);
            }

        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch17.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView58);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Leg.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

