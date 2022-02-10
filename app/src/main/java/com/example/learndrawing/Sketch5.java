package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch5  extends AppCompatActivity
{
    private Button button59,button60;
    private ImageSwitcher switch27;
    ImageView imageView;
    private int[]images={R.drawable.fff1,R.drawable.fff2,R.drawable.fff3,R.drawable.fff4,
            R.drawable.fff5,R.drawable.fff6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch5);
        button59 = (Button)findViewById(R.id.button59);
        button60 = (Button) findViewById(R.id.button60);
        switch27 = (ImageSwitcher) findViewById(R.id.switch27);
        switch27.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch5.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch27.setInAnimation(this,android.R.anim.slide_in_left);
        switch27.setOutAnimation(this,android.R.anim.slide_out_right);
        button59.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        if (position > 0)
                            position--;
                        else if (position < 0)
                            position = 0;
                        switch27.setImageResource(images[position]);
                    }

                });
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch27.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView68);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch5.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

