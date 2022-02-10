package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Butterfly extends AppCompatActivity
{
    private Button button89,button90;
    private ImageSwitcher switch42;
    ImageView imageView;
    private int[]images={R.drawable.butterfly1,R.drawable.butterfly2,R.drawable.butterfly3,
            R.drawable.butterfly4,R.drawable.butterfly5,R.drawable.butterfly6,R.drawable.butterfly7,
            R.drawable.butterfly8,R.drawable.butterfly9,R.drawable.butterfly10,R.drawable.butterfly11,
            R.drawable.butterfly12};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterfly);
        button89 = (Button)findViewById(R.id.button89);
        button90 = (Button) findViewById(R.id.button90);
        switch42 = (ImageSwitcher) findViewById(R.id.switch42);
        switch42.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Butterfly.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch42.setInAnimation(this,android.R.anim.slide_in_left);
        switch42.setOutAnimation(this,android.R.anim.slide_out_right);
        button89.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch42.setImageResource(images[position]);
            }

        });
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch42.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView93);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Butterfly.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

