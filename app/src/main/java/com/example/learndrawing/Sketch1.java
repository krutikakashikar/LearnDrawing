package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch1 extends AppCompatActivity
{
    private Button button53,button54;
    private ImageSwitcher switch24;
    ImageView imageView;
    private int[]images={R.drawable.pof1,R.drawable.pof2,R.drawable.pof3,R.drawable.pof4};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch1);
        button53 = (Button)findViewById(R.id.button53);
        button54 = (Button) findViewById(R.id.button54);
        switch24 = (ImageSwitcher) findViewById(R.id.switch24);
        switch24.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch1.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch24.setInAnimation(this,android.R.anim.slide_in_left);
        switch24.setOutAnimation(this,android.R.anim.slide_out_right);
        button53.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch24.setImageResource(images[position]);
            }

        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch24.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView65);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch1.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

