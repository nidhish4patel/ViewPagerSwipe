package com.nidhi.viewpagerswipe;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nidhi.viewpagerswipe.adapters.BannersAdapter;

public class MainActivity extends AppCompatActivity {

    private Context context = MainActivity.this;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new BannersAdapter());
    }
}
