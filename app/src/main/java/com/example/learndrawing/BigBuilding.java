package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class BigBuilding extends AppCompatActivity
{
    private Button button91,button92;
    private ImageSwitcher switch43;
    ImageView imageView;
    private int[]images={R.drawable.bigbuildingillusion1,R.drawable.bigbuildingillusion2,R.drawable.bigbuildingillusion3,
            R.drawable.bigbuildingillusion4,R.drawable.bigbuildingillusion5,R.drawable.bigbuildingillusion6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigbuilding);
        button91 = (Button)findViewById(R.id.button91);
        button92 = (Button) findViewById(R.id.button92);
        switch43 = (ImageSwitcher) findViewById(R.id.switch43);
        switch43.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(BigBuilding.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch43.setInAnimation(this,android.R.anim.slide_in_left);
        switch43.setOutAnimation(this,android.R.anim.slide_out_right);
        button91.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch43.setImageResource(images[position]);
            }

        });
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch43.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView94);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(BigBuilding.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


