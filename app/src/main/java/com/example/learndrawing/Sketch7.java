package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch7 extends AppCompatActivity
{
    private Button button65,button66;
    private ImageSwitcher switch30;
    ImageView imageView;
    private int[]images={R.drawable.w1,R.drawable.w2,R.drawable.w3};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch7);
        button65 = (Button)findViewById(R.id.button65);
        button66 = (Button) findViewById(R.id.button66);
        switch30 = (ImageSwitcher) findViewById(R.id.switch30);
        switch30.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch7.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch30.setInAnimation(this,android.R.anim.slide_in_left);
        switch30.setOutAnimation(this,android.R.anim.slide_out_right);
        button65.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch30.setImageResource(images[position]);
            }

        });
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch30.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView71);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch7.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


