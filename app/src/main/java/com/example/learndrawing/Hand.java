package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Hand extends AppCompatActivity
{
    private Button button41,button42;
    private ImageSwitcher switch18;
    ImageView imageView;
    private int[]images={R.drawable.hand1,R.drawable.hand2,R.drawable.hand3,R.drawable.hand4};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hand);
        button41= (Button)findViewById(R.id.button41);
        button42 = (Button) findViewById(R.id.button42);
        switch18 = (ImageSwitcher) findViewById(R.id.switch18);
        switch18.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Hand.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch18.setInAnimation(this,android.R.anim.slide_in_left);
        switch18.setOutAnimation(this,android.R.anim.slide_out_right);
        button41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch18.setImageResource(images[position]);
            }

        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch18.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView59);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Hand.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

