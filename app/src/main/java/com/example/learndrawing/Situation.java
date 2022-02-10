package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Situation extends AppCompatActivity
{
    private Button button29,button30;
    private ImageSwitcher switch12;
    ImageView imageView;
    private int[]images={R.drawable.pos1,R.drawable.pos2,R.drawable.pos3,R.drawable.pos4,
            R.drawable.pos5, R.drawable.pos6,R.drawable.pos7,R.drawable.pos8,R.drawable.pos9,
    R.drawable.pos10,R.drawable.pos11,R.drawable.pos12};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.situation);
        button29 = (Button)findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);
        switch12 = (ImageSwitcher) findViewById(R.id.switch12);
        switch12.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Situation.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch12.setInAnimation(this,android.R.anim.slide_in_left);
        switch12.setOutAnimation(this,android.R.anim.slide_out_right);
        button29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch12.setImageResource(images[position]);
            }

        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch12.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView53);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Situation.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


