package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Rose1 extends AppCompatActivity
{
    private Button button17,button18;
    private ImageSwitcher switch6;
    ImageView imageView;
    private int[]images={R.drawable.ful1,R.drawable.ful2,R.drawable.ful3,R.drawable.ful4,};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rose1);
        button17 = (Button)findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        switch6 = (ImageSwitcher) findViewById(R.id.switch6);
        switch6.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Rose1.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch6.setInAnimation(this,android.R.anim.slide_in_left);
        switch6.setOutAnimation(this,android.R.anim.slide_out_right);
        button17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch6.setImageResource(images[position]);
            }

        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch6.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView47);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Rose1.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



