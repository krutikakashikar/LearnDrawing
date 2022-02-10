package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Eye extends AppCompatActivity
{
    private Button button35,button36;
    private ImageSwitcher switch15;
    ImageView imageView;
    private int[]images={R.drawable.eye1,R.drawable.eyee2,R.drawable.eye3,R.drawable.eye4,R.drawable.eye5,
    R.drawable.eye6,R.drawable.eye7,R.drawable.eye8};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eye);
        button35= (Button)findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
        switch15 = (ImageSwitcher) findViewById(R.id.switch15);
        switch15.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Eye.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch15.setInAnimation(this,android.R.anim.slide_in_left);
        switch15.setOutAnimation(this,android.R.anim.slide_out_right);
        button35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch15.setImageResource(images[position]);
            }

        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch15.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView56);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Eye.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


