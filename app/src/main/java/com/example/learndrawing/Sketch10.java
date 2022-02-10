package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch10  extends AppCompatActivity
{
    private Button button71,button72;
    private ImageSwitcher switch33;
    ImageView imageView;
    private int[]images={R.drawable.ll1,R.drawable.ll2,R.drawable.ll3,R.drawable.ll4,R.drawable.ll5,
            R.drawable.ll6,R.drawable.ll7,R.drawable.ll8,R.drawable.ll9};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch10);
        button71 = (Button)findViewById(R.id.button71);
        button72 = (Button) findViewById(R.id.button72);
        switch33 = (ImageSwitcher) findViewById(R.id.switch33);
        switch33.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch10.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch33.setInAnimation(this,android.R.anim.slide_in_left);
        switch33.setOutAnimation(this,android.R.anim.slide_out_right);
        button71.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch33.setImageResource(images[position]);
            }

        });
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch33.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView74);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch10.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

