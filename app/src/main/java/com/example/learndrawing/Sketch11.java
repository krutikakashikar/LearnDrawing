package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Sketch11  extends AppCompatActivity
{
    private Button button73,button74;
    private ImageSwitcher switch34;
    ImageView imageView;
    private int[]images={R.drawable.abc1,R.drawable.abc2,R.drawable.abc3,R.drawable.abc4,R.drawable.abc5,
            R.drawable.abc6,R.drawable.abc7};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sketch11);
        button73 = (Button)findViewById(R.id.button73);
        button74 = (Button) findViewById(R.id.button74);
        switch34 = (ImageSwitcher) findViewById(R.id.switch34);
        switch34.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(Sketch11.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch34.setInAnimation(this,android.R.anim.slide_in_left);
        switch34.setOutAnimation(this,android.R.anim.slide_out_right);
        button73.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch34.setImageResource(images[position]);
            }

        });
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch34.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView75);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(Sketch11.this, PortraitImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}


