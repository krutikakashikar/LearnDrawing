package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Face4 extends AppCompatActivity
{
    private Button button45,button46;
    private ImageSwitcher switch20;
    ImageView imageView;
    private int[]images={R.drawable.fary1,R.drawable.fary2,R.drawable.fary3};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face4);
        button45 = (Button)findViewById(R.id.button45);
        button46 = (Button) findViewById(R.id.button46);
        switch20 = (ImageSwitcher) findViewById(R.id.switch20);
        switch20.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Face4.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch20.setInAnimation(this,android.R.anim.slide_in_left);
        switch20.setOutAnimation(this,android.R.anim.slide_out_right);
        button45.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch20.setImageResource(images[position]);
            }

        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch20.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView61);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Face4.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


