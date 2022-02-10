package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Squirrel  extends AppCompatActivity
{
    private Button button5,button6;
    private ImageSwitcher switch2;
    ImageView imageView;
    private int[]images={R.drawable.squirrel1,R.drawable.squirrel2,R.drawable.squirrel3,
            R.drawable.squirrel4,R.drawable.squirrel5};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squirrel);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        switch2 = (ImageSwitcher) findViewById(R.id.switch2);
        switch2.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Squirrel.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch2.setInAnimation(this,android.R.anim.slide_in_left);
        switch2.setOutAnimation(this,android.R.anim.slide_out_right);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch2.setImageResource(images[position]);
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch2.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView44);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Squirrel.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



