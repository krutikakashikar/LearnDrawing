package com.example.learndrawing;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class ImageAdapterClass extends PagerAdapter {
    Context mContext;

    ImageAdapterClass(Context context) {
        this.mContext = context;
    }
    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view==((ImageView)object);
    }
    private int []SliderImageId=new int[]{
             R.drawable.slider2,
            R.drawable.slider3, R.drawable.slider4,
R.drawable.slider9,
            R.drawable.slider7, R.drawable.slider8,
    };
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(SliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
    @Override
    public int getCount(){
        return SliderImageId.length;
    }
}

