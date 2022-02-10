package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Bird extends AppCompatActivity
{
    private Button button13,button14;
    private ImageSwitcher switch4;
    ImageView imageView;
    private int[]images={R.drawable.bird1,R.drawable.bird2,R.drawable.bird3,R.drawable.bird4,
            R.drawable.bird5, R.drawable.bird6,R.drawable.bird7,R.drawable.bird8,R.drawable.bird9};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bird);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        switch4 = (ImageSwitcher) findViewById(R.id.switch4);
        switch4.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Bird.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch4.setInAnimation(this,android.R.anim.slide_in_left);
        switch4.setOutAnimation(this,android.R.anim.slide_out_right);
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch4.setImageResource(images[position]);
            }

        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch4.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView45);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Bird.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


