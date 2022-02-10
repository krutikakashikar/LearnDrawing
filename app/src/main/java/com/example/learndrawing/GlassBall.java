package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class GlassBall extends AppCompatActivity
{
    private Button button87,button88;
    private ImageSwitcher switch41;
    ImageView imageView;
    private int[]images={R.drawable.glassball1,R.drawable.glassball2,R.drawable.glassball3,
            R.drawable.glassball4,R.drawable.glassball5,R.drawable.glassball6,R.drawable.glassball7,
            R.drawable.glassball8,R.drawable.glassball9};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glassball);
        button87 = (Button)findViewById(R.id.button87);
        button88 = (Button) findViewById(R.id.button88);
        switch41 = (ImageSwitcher) findViewById(R.id.switch41);
        switch41.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(GlassBall.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch41.setInAnimation(this,android.R.anim.slide_in_left);
        switch41.setOutAnimation(this,android.R.anim.slide_out_right);
        button87.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch41.setImageResource(images[position]);
            }

        });
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch41.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView92);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(GlassBall.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}
