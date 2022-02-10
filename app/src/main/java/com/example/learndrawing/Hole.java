package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Hole extends AppCompatActivity
{
    private Button button83,button84;
    private ImageSwitcher switch39;
    ImageView imageView;
    private int[]images={R.drawable.hole1,R.drawable.hole2,R.drawable.hole3};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hole);
        button83 = (Button)findViewById(R.id.button83);
        button84 = (Button) findViewById(R.id.button84);
        switch39 = (ImageSwitcher) findViewById(R.id.switch39);
        switch39.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Hole.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch39.setInAnimation(this,android.R.anim.slide_in_left);
        switch39.setOutAnimation(this,android.R.anim.slide_out_right);
        button83.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch39.setImageResource(images[position]);
            }

        });
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch39.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView90);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Hole.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


