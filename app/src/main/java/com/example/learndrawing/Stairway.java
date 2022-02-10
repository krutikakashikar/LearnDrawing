package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Stairway extends AppCompatActivity
{
    private Button button85,button86;
    private ImageSwitcher switch40;
    ImageView imageView;
    private int[]images={R.drawable.stairwaytoheaven1,R.drawable.stairwaytoheaven2,R.drawable.stairwaytoheaven3,
    R.drawable.stairwaytoheaven4,R.drawable.stairwaytoheaven6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stairway);
        button85 = (Button)findViewById(R.id.button85);
        button86 = (Button) findViewById(R.id.button86);
        switch40 = (ImageSwitcher) findViewById(R.id.switch40);
        switch40.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Stairway.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch40.setInAnimation(this,android.R.anim.slide_in_left);
        switch40.setOutAnimation(this,android.R.anim.slide_out_right);
        button85.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch40.setImageResource(images[position]);
            }

        });
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch40.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView91);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Stairway.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



