package com.extremefactor.mapchatsample;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import java.util.List;
import java.util.Vector;


public class MainActivity extends FragmentActivity {

    public static FragmentManager fragmentManager;

    private PagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisePaging();
    }

    private void initialisePaging() {
        // TODO Auto-generated method stub
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this,MapsFragment.class.getName()));
        fragments.add(Fragment.instantiate(this,ChatFragment.class.getName()));
        mPagerAdapter =new TabHostAdapter(this.getSupportFragmentManager(), fragments);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(mPagerAdapter);

    }

   }
