package com.big.amazingwaterfalls;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class AdapterImage extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.fall_1, R.drawable.fall_2, R.drawable.fall_3, R.drawable.fall_4, R.drawable.fall_5, R.drawable.fall_6, R.drawable.fall_7, R.drawable.fall_8, R.drawable.fall_9};
    AdapterImage(Context context) {
        mContext = context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}
