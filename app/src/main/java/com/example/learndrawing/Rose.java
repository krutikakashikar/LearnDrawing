package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Rose extends AppCompatActivity
{
    private Button button2,button4;
    private ImageSwitcher switch1;
    ImageView imageView;
    private int[]images={R.drawable.rosee1,R.drawable.rosee2,R.drawable.rosee3,R.drawable.rosee4,R.drawable.rosee5,
            R.drawable.rosee6,R.drawable.rosee7,R.drawable.rosee8};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rose);
       button2 = (Button)findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        switch1 = (ImageSwitcher) findViewById(R.id.switch1);
        switch1.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Rose.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch1.setInAnimation(this,android.R.anim.slide_in_left);
        switch1.setOutAnimation(this,android.R.anim.slide_out_right);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch1.setImageResource(images[position]);
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch1.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView42);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Rose.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


