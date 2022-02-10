package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch8 extends AppCompatActivity
{
    private Button button67,button68;
    private ImageSwitcher switch31;
    ImageView imageView;
    private int[]images={R.drawable.ww1,R.drawable.ww2,R.drawable.ww3,R.drawable.ww4,R.drawable.ww5,
            R.drawable.ww6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch8);
        button67 = (Button)findViewById(R.id.button67);
        button68 = (Button) findViewById(R.id.button68);
        switch31 = (ImageSwitcher) findViewById(R.id.switch31);
        switch31.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch8.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch31.setInAnimation(this,android.R.anim.slide_in_left);
        switch31.setOutAnimation(this,android.R.anim.slide_out_right);
        button67.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch31.setImageResource(images[position]);
            }

        });
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch31.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView72);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch8.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

