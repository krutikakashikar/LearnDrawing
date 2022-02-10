package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch9 extends AppCompatActivity
{
    private Button button69,button70;
    private ImageSwitcher switch32;
    ImageView imageView;
    private int[]images={R.drawable.l1,R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
            R.drawable.l6,R.drawable.l7,R.drawable.l8};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch9);
        button69 = (Button)findViewById(R.id.button69);
        button70 = (Button) findViewById(R.id.button70);
        switch32 = (ImageSwitcher) findViewById(R.id.switch32);
        switch32.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch9.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch32.setInAnimation(this,android.R.anim.slide_in_left);
        switch32.setOutAnimation(this,android.R.anim.slide_out_right);
        button69.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch32.setImageResource(images[position]);
            }

        });
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch32.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView73);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch9.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

