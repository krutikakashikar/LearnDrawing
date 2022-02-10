package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Elephent extends AppCompatActivity
{
    private Button button21,button22;
    private ImageSwitcher switch8;
    ImageView imageView;
    private int[]images={R.drawable.elephent1,R.drawable.elephent2,R.drawable.elephent3,R.drawable.elephent4};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elephent);
        button21 = (Button)findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        switch8 = (ImageSwitcher) findViewById(R.id.switch8);
        switch8.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Elephent.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch8.setInAnimation(this,android.R.anim.slide_in_left);
        switch8.setOutAnimation(this,android.R.anim.slide_out_right);
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch8.setImageResource(images[position]);
            }

        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch8.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView49);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Elephent.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



