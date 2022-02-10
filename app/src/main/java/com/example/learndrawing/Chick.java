package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Chick extends AppCompatActivity
{
    private Button previousbtn,nextbtn;
    private ImageSwitcher imgsw;
    ImageView imageView;
    private int[]images={R.drawable.chick1,R.drawable.chick2,R.drawable.chick3,R.drawable.chick4,R.drawable.chick5,R.drawable.chick6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chick);
        previousbtn = (Button)findViewById(R.id.btnprevious);
        nextbtn = (Button) findViewById(R.id.btnNext);
        imgsw = (ImageSwitcher) findViewById(R.id.imgsw);
        imgsw.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Chick.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        imgsw.setInAnimation(this,android.R.anim.slide_in_left);
        imgsw.setOutAnimation(this,android.R.anim.slide_out_right);
        previousbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                imgsw.setImageResource(images[position]);
            }

        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                imgsw.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView40);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Chick.this, BasicImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}



