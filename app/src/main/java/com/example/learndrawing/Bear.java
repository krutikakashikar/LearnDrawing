package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Bear extends AppCompatActivity
{
    private Button button7,button12;
    private ImageSwitcher switch3;
    ImageView imageView;
    private int[]images={R.drawable.bear1,R.drawable.bear2,R.drawable.bear3,R.drawable.bear4,
            R.drawable.bear5, R.drawable.bear6,R.drawable.bear7};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bear);
        button7 = (Button)findViewById(R.id.button7);
        button12 = (Button) findViewById(R.id.button12);
        switch3 = (ImageSwitcher) findViewById(R.id.switch3);
        switch3.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Bear.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch3.setInAnimation(this,android.R.anim.slide_in_left);
        switch3.setOutAnimation(this,android.R.anim.slide_out_right);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch3.setImageResource(images[position]);
            }

        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch3.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView43);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Bear.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



