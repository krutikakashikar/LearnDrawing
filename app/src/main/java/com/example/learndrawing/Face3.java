package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Face3 extends AppCompatActivity
{
    private Button button43,button44;
    private ImageSwitcher switch19;
    ImageView imageView;
    private int[]images={R.drawable.face31,R.drawable.face32,R.drawable.face33,R.drawable.face34,
            R.drawable.face35, R.drawable.face36,R.drawable.face37,R.drawable.face38,R.drawable.face39};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face3);
        button43 = (Button)findViewById(R.id.button43);
        button44 = (Button) findViewById(R.id.button44);
        switch19 = (ImageSwitcher) findViewById(R.id.switch19);
        switch19.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Face3.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch19.setInAnimation(this,android.R.anim.slide_in_left);
        switch19.setOutAnimation(this,android.R.anim.slide_out_right);
        button43.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch19.setImageResource(images[position]);
            }

        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch19.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView60);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Face3.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}

