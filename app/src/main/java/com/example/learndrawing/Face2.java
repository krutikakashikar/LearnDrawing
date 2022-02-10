package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Face2 extends AppCompatActivity
{
    private Button button27,button28;
    private ImageSwitcher switch11;
    ImageView imageView;
    private int[]images={R.drawable.face21,R.drawable.face22,R.drawable.face23,R.drawable.face24,
            R.drawable.face25, R.drawable.face26,R.drawable.face27};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face2);
        button27 = (Button)findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        switch11 = (ImageSwitcher) findViewById(R.id.switch11);
        switch11.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Face2.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch11.setInAnimation(this,android.R.anim.slide_in_left);
        switch11.setOutAnimation(this,android.R.anim.slide_out_right);
        button27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch11.setImageResource(images[position]);
            }

        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch11.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView52);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Face2.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



