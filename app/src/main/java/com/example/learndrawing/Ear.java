package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Ear extends AppCompatActivity
{
    private Button button33,button34;
    private ImageSwitcher switch14;
    ImageView imageView;
    private int[]images={R.drawable.ear1,R.drawable.ear2,R.drawable.ear3};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ear);
        button33 = (Button)findViewById(R.id.button33);
        button34 = (Button) findViewById(R.id.button34);
        switch14 = (ImageSwitcher) findViewById(R.id.switch14);
        switch14.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Ear.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch14.setInAnimation(this,android.R.anim.slide_in_left);
        switch14.setOutAnimation(this,android.R.anim.slide_out_right);
        button33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch14.setImageResource(images[position]);
            }

        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch14.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView55);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Ear.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


