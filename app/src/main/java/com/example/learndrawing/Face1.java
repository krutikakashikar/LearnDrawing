package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Face1 extends AppCompatActivity
{
    private Button button25,button26;
    private ImageSwitcher switch10;
    ImageView imageView;
    private int[]images={R.drawable.face11,R.drawable.face12,R.drawable.face13,R.drawable.face14,
            R.drawable.face15, R.drawable.face16,R.drawable.face17,R.drawable.face18};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face1);
        button25 = (Button)findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        switch10 = (ImageSwitcher) findViewById(R.id.switch10);
        switch10.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Face1.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch10.setInAnimation(this,android.R.anim.slide_in_left);
        switch10.setOutAnimation(this,android.R.anim.slide_out_right);
        button25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch10.setImageResource(images[position]);
            }

        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch10.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView51);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Face1.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


