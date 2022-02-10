package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch3 extends AppCompatActivity
{
    private Button button57,button58;
    private ImageSwitcher switch26;
    ImageView imageView;
    private int[]images={R.drawable.gir1,R.drawable.gir2,R.drawable.gir3,R.drawable.gir4,R.drawable.gir5,
            R.drawable.gir6,R.drawable.gir7};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch3);
        button57 = (Button)findViewById(R.id.button57);
        button58 = (Button) findViewById(R.id.button58);
        switch26 = (ImageSwitcher) findViewById(R.id.switch26);
        switch26.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch3.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch26.setInAnimation(this,android.R.anim.slide_in_left);
        switch26.setOutAnimation(this,android.R.anim.slide_out_right);
        button57.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch26.setImageResource(images[position]);
            }

        });
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch26.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView67);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch3.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


