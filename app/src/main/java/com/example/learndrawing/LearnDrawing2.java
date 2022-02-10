package com.example.learndrawing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class LearnDrawing2 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    ViewPager mViewpager;
    private int dotscount;
    private ImageView[] dots;
    LinearLayout sliderDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learndrawing2);
        mViewpager = (ViewPager) findViewById(R.id.ViewPage1);
        sliderDots = (LinearLayout) findViewById(R.id.sliderDots);
        ImageAdapterClass adapterView = new ImageAdapterClass(LearnDrawing2.this);
        mViewpager.setAdapter(adapterView);

        dotscount = adapterView.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDots.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        btn1 = (Button) findViewById(R.id.button8);
        btn2 = (Button) findViewById(R.id.button11);
        btn3 = (Button) findViewById(R.id.button10);
        btn4 = (Button) findViewById(R.id.button9);
        btn5 = (Button) findViewById(R.id.button3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(LearnDrawing2.this, Sample.class);
                startActivity(ob);
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1 = new Intent(LearnDrawing2.this, BasicImage.class);
                startActivity(ob1);
                finish();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2 = new Intent(LearnDrawing2.this, AdvanceImage.class);
                startActivity(ob2);
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3 = new Intent(LearnDrawing2.this, ThreeDImage.class);
                startActivity(ob3);
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4 = new Intent(LearnDrawing2.this, PortraitImage.class);
                startActivity(ob4);
                finish();


            }

        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), FeedBack.class));
        finish();
    }


        }




