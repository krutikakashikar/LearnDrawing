package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Ladder extends AppCompatActivity
{
    private Button button81,button82;
    private ImageSwitcher switch38;
    ImageView imageView;
    private int[]images={R.drawable.ladder1,R.drawable.ladder2,R.drawable.ladder3,
            R.drawable.ladder4,R.drawable.ladder5};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ladder);
        button81 = (Button)findViewById(R.id.button81);
        button82 = (Button) findViewById(R.id.button82);
        switch38 = (ImageSwitcher) findViewById(R.id.switch38);
        switch38.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Ladder.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch38.setInAnimation(this,android.R.anim.slide_in_left);
        switch38.setOutAnimation(this,android.R.anim.slide_out_right);
        button81.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch38.setImageResource(images[position]);
            }

        });
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch38.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView89);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Ladder.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

