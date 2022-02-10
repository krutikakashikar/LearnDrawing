package com.example.learndrawing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MyPageAdapter extends PagerAdapter {
    private LayoutInflater inflater;
    private int[] layout;
    private Context context;

    public MyPageAdapter(int[] layout, Context context) {
        this.layout = layout;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));

    }


    @Override
    public int getCount() {
        return layout.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View v=inflater.inflate(layout[position],container,false);

        container.addView(v);
        return (v);

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       View v=(View)object;
       container.removeView(v);

    }
}

