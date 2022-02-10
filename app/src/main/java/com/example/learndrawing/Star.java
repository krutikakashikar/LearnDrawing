package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Star extends AppCompatActivity
{
    private Button button75,button76;
    private ImageSwitcher switch35;
    ImageView imageView;
    private int[]images={R.drawable.star1,R.drawable.star2,R.drawable.star3,R.drawable.star4,R.drawable.star5,
            R.drawable.star6,R.drawable.star7,R.drawable.star8};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.star);
        button75 = (Button)findViewById(R.id.button75);
        button76 = (Button) findViewById(R.id.button76);
        switch35 = (ImageSwitcher) findViewById(R.id.switch35);
        switch35.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Star.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch35.setInAnimation(this,android.R.anim.slide_in_left);
        switch35.setOutAnimation(this,android.R.anim.slide_out_right);
        button75.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch35.setImageResource(images[position]);
            }

        });
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch35.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView86);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Star.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


