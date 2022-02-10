package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;


public class Sample extends AppCompatActivity {
    private Button previous, next;
    private ImageSwitcher imgsw;
    ImageView imageView;
    private int[] images = {R.drawable.sample1, R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5, R.drawable.sample6, R.drawable.sample7,
            R.drawable.sample8, R.drawable.sample9, R.drawable.sample10, R.drawable.sample11,
            R.drawable.sample12, R.drawable.sample13, R.drawable.sample14, R.drawable.sample15,
            R.drawable.sample16, R.drawable.sample17, R.drawable.sample18, R.drawable.sample19,
            R.drawable.sample20, R.drawable.sample21, R.drawable.sample22, R.drawable.sample23,
            R.drawable.sample24, R.drawable.sample25, R.drawable.sample26, R.drawable.sample27};
    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.sample);
        previous = (Button) findViewById(R.id.previous);
        next = (Button) findViewById(R.id.Next);
        imgsw = (ImageSwitcher) findViewById(R.id.imageswicher);
        imgsw.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sample.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        imgsw.setInAnimation(this, android.R.anim.slide_in_left);
        imgsw.setOutAnimation(this, android.R.anim.slide_out_right);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                imgsw.setImageResource(images[position]);
            }

        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < images.length)
                    position++;
                if (position >= images.length)
                    position = images.length - 1;
                imgsw.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView41);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sample.this, LearnDrawing2.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}





