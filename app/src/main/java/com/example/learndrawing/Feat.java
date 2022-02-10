package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Feat extends AppCompatActivity
{
    private Button button37,button38;
    private ImageSwitcher switch16;
    ImageView imageView;
    private int[]images={R.drawable.feat1,R.drawable.feat2,R.drawable.feat3};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feat);
        button37= (Button)findViewById(R.id.button37);
        button38 = (Button) findViewById(R.id.button38);
        switch16 = (ImageSwitcher) findViewById(R.id.switch16);
        switch16.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Feat.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch16.setInAnimation(this,android.R.anim.slide_in_left);
        switch16.setOutAnimation(this,android.R.anim.slide_out_right);
        button37.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch16.setImageResource(images[position]);
            }

        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch16.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView57);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Feat.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}




