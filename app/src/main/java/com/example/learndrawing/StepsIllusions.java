package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class StepsIllusions extends AppCompatActivity
{
    private Button button79,button80;
    private ImageSwitcher switch37;
    ImageView imageView;
    private int[]images={R.drawable.stepsillusions1,R.drawable.stepsillusions2,R.drawable.stepsillusions3,
            R.drawable.stepsillusions4,R.drawable.stepsillusions5,R.drawable.stepsillusions6};
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stepsillusions);
        button79 = (Button)findViewById(R.id.button79);
        button80 = (Button) findViewById(R.id.button80);
        switch37 = (ImageSwitcher) findViewById(R.id.switch37);
        switch37.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imgview = new ImageView(StepsIllusions.this);
                imgview.setImageResource(images[position]);
                return imgview;
            }
        });
        switch37.setInAnimation(this,android.R.anim.slide_in_left);
        switch37.setOutAnimation(this,android.R.anim.slide_out_right);
        button79.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (position > 0)
                    position--;
                else if (position < 0)
                    position = 0;
                switch37.setImageResource(images[position]);
            }

        });
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position<images.length)
                    position++;
                if(position>=images.length)
                    position=images.length-1;
                switch37.setImageResource(images[position]);
                imageView = (ImageView) findViewById(R.id.imageView88);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(StepsIllusions.this, ThreeDImage.class);
                        startActivity(ob);

                        finish();
                    }
                });
            }



        });
    }

}
 
