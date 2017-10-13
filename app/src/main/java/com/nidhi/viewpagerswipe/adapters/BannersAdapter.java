package com.nidhi.viewpagerswipe.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nidhi.viewpagerswipe.R;

/**
 * Created by nidhi on 5/20/2017.
 */

public class BannersAdapter extends PagerAdapter {

    private int[] imagsList = {R.mipmap.a,R.mipmap.b,R.mipmap.c,R.mipmap.d,
            R.mipmap.e,R.mipmap.f,R.mipmap.g,R.mipmap.h};

    @Override
    public int getCount() {
        return imagsList.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //apend xml

        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.adapter_banner,container,false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageViewId);

        imageView.setImageResource(imagsList[position]);

        container.addView(view);

        return view;
    }
}
