package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Hand3d extends AppCompatActivity
{
    private Button button93,button94;
    private ImageSwitcher switch44;
    ImageView imageView;
    private int[]images={R.drawable.hand3d1,R.drawable.hand3d2,R.drawable.hand3d3,
            R.drawable.hand3d4,R.drawable.hand3d5};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hand3d);
        button93 = (Button)findViewById(R.id.button93);
        button94 = (Button) findViewById(R.id.button94);
        switch44 = (ImageSwitcher) findViewById(R.id.switch44);
        switch44.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Hand3d.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch44.setInAnimation(this,android.R.anim.slide_in_left);
        switch44.setOutAnimation(this,android.R.anim.slide_out_right);
        button93.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch44.setImageResource(images[position]);
            }

        });
        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch44.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView95);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Hand3d.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

