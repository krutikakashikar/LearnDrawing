package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Nose extends AppCompatActivity {
    private Button button47, button48;
    private ImageSwitcher switch21;
    ImageView imageView;
    private int[] images = {R.drawable.nos1, R.drawable.nos2, R.drawable.nos3, R.drawable.nos4,
            R.drawable.nos5, R.drawable.nos6, R.drawable.nos7};
    private int position = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nose);
        button47 = (Button) findViewById(R.id.button47);
        button48 = (Button) findViewById(R.id.button48);
        switch21 = (ImageSwitcher) findViewById(R.id.switch21);
        switch21.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Nose.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch21.setInAnimation(this, android.R.anim.slide_in_left);
        switch21.setOutAnimation(this, android.R.anim.slide_out_right);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch21.setImageResource(images[position]);
            }

        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < images.length)
                    position++;
                if (position >= images.length)
                    position = images.length - 1;
                switch21.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView62);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Nose.this, AdvanceImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }


        });
    }

}




