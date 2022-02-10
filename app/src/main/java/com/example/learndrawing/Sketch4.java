package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch4  extends AppCompatActivity
{
    private Button button61,button62;
    private ImageSwitcher switch28;
    ImageView imageView;
    private int[]images={R.drawable.ff1,R.drawable.ff2,R.drawable.ff3,R.drawable.ff4};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch4);
        button61 = (Button)findViewById(R.id.button61);
        button62 = (Button) findViewById(R.id.button62);
        switch28 = (ImageSwitcher) findViewById(R.id.switch28);
        switch28.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch4.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch28.setInAnimation(this,android.R.anim.slide_in_left);
        switch28.setOutAnimation(this,android.R.anim.slide_out_right);
        button61
                .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch28.setImageResource(images[position]);
            }

        });
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch28.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView69);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch4.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

