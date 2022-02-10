package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Polobear extends AppCompatActivity
{
    private Button button23,button24;
    private ImageSwitcher switch9;
    ImageView imageView;
    private int[]images={R.drawable.polobear1,R.drawable.polobear2,R.drawable.polobear3,R.drawable.polobear4,
    R.drawable.polobear5,R.drawable.polobear6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polobear);
        button23 = (Button)findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        switch9 = (ImageSwitcher) findViewById(R.id.switch9);
        switch9.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Polobear.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch9.setInAnimation(this,android.R.anim.slide_in_left);
        switch9.setOutAnimation(this,android.R.anim.slide_out_right);
        button23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch9.setImageResource(images[position]);
            }

        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch9.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView50);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Polobear.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



