package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Triangle extends AppCompatActivity
{
    private Button button77,button78;
    private ImageSwitcher switch36;
    ImageView imageView;
    private int[]images={R.drawable.opticalillusiontriangle1,R.drawable.opticalillusiontriangle2,R.drawable.opticalillusiontriangle3};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);
        button77 = (Button)findViewById(R.id.button77);
        button78 = (Button) findViewById(R.id.button78);
        switch36 = (ImageSwitcher) findViewById(R.id.switch36);
        switch36.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Triangle.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch36.setInAnimation(this,android.R.anim.slide_in_left);
        switch36.setOutAnimation(this,android.R.anim.slide_out_right);
        button77.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch36.setImageResource(images[position]);
            }

        });
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch36.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView87);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Triangle.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

