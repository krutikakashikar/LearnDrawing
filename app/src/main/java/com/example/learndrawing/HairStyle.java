package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class HairStyle extends AppCompatActivity
{
    private Button button31,button32;
    private ImageSwitcher switch13;
    ImageView imageView;
    private int[]images={R.drawable.hair1,R.drawable.hair2,R.drawable.hair3,R.drawable.hair4,
            R.drawable.hair5, R.drawable.hair6,R.drawable.hair7,R.drawable.hair8};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hairstyle);
        button31 = (Button)findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);
        switch13 = (ImageSwitcher) findViewById(R.id.switch13);
        switch13.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(HairStyle.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch13.setInAnimation(this,android.R.anim.slide_in_left);
        switch13.setOutAnimation(this,android.R.anim.slide_out_right);
        button31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch13.setImageResource(images[position]);
            }

        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch13.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView54);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(HairStyle.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



