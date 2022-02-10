package com.example.learndrawing;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class StartSlider extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private int[]layout={R.layout.intro1,R.layout.intro2,R.layout.intro3};
    private MyPageAdapter myPageAdaper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>=19)
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else
        {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setContentView(R.layout.activity_start_slider);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        linearLayout=(LinearLayout)findViewById(R.id.dotLayout);
        myPageAdaper=new MyPageAdapter(layout,this);
        viewPager.setAdapter(myPageAdaper);

    }


}
