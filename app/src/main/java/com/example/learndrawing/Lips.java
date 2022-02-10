package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Lips extends AppCompatActivity
{
    private Button button51,button52;
    private ImageSwitcher switch23;
    ImageView imageView;
    private int[]images={R.drawable.lip1,R.drawable.lip2,R.drawable.lip3,R.drawable.lip3,
            R.drawable.lip4, R.drawable.lip5,R.drawable.lip6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lips);
        button51 = (Button)findViewById(R.id.button51);
        button52 = (Button) findViewById(R.id.button52);
        switch23 = (ImageSwitcher) findViewById(R.id.switch23);
        switch23.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Lips.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch23.setInAnimation(this,android.R.anim.slide_in_left);
        switch23.setOutAnimation(this,android.R.anim.slide_out_right);
        button51.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch23.setImageResource(images[position]);
            }

        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch23.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView64);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Lips.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


