package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch2 extends AppCompatActivity
{
    private Button button55,button56;
    private ImageSwitcher switch25;
    ImageView imageView;
    private int[]images={R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch2);
        button55 = (Button)findViewById(R.id.button55);
        button56 = (Button) findViewById(R.id.button56);
        switch25 = (ImageSwitcher) findViewById(R.id.switch25);
        switch25.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch2.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch25.setInAnimation(this,android.R.anim.slide_in_left);
        switch25.setOutAnimation(this,android.R.anim.slide_out_right);
        button55.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch25.setImageResource(images[position]);
            }

        });
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch25.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView66);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch2.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


