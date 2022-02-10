package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Bat extends AppCompatActivity
{
    private Button button16,button15;
    private ImageSwitcher switch5;
    ImageView imageView;
    private int[]images={R.drawable.bat1,R.drawable.bat2,R.drawable.bat3,R.drawable.bat4,
            R.drawable.bat5, R.drawable.bat6,R.drawable.bat7,R.drawable.bat8,
            R.drawable.bat9,R.drawable.bat10,R.drawable.bat11,R.drawable.bat12,R.drawable.bat13,
    R.drawable.bat14,R.drawable.bat15};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bat);
        button16 = (Button)findViewById(R.id.button16);
        button15 = (Button) findViewById(R.id.button15);
        switch5 = (ImageSwitcher) findViewById(R.id.switch5);
        switch5.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Bat.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch5.setInAnimation(this,android.R.anim.slide_in_left);
        switch5.setOutAnimation(this,android.R.anim.slide_out_right);
        button16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch5.setImageResource(images[position]);
            }

        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch5.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView46);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Bat.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



