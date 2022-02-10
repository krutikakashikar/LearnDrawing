package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Giraffe extends AppCompatActivity
{
    private Button button19,button20;
    private ImageSwitcher switch7;
    ImageView imageView;
    private int[]images={R.drawable.giraffe1,R.drawable.giraffe2,R.drawable.giraffe3,R.drawable.giraffe4,
            R.drawable.giraffe5, R.drawable.giraffe6,R.drawable.giraffe7,R.drawable.giraffe8};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giraffe);
        button19 = (Button)findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        switch7 = (ImageSwitcher) findViewById(R.id.switch7);
        switch7.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Giraffe.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch7.setInAnimation(this,android.R.anim.slide_in_left);
        switch7.setOutAnimation(this,android.R.anim.slide_out_right);
        button19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch7.setImageResource(images[position]);
            }

        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch7.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView48);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Giraffe.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



