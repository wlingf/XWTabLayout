package com.xw.xwtablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.xw.xwtablayoutlib.CommonTabLayout;
import com.xw.xwtablayoutlib.listener.CustomTabEntity;
import com.xw.xwtablayoutlib.listener.OnTabSelectListener;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout)
    CommonTabLayout tabLayout;

    ArrayList<Fragment> fragments;
    ArrayList<CustomTabEntity> beans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initTabLayoutBeans();
        initFragments();
        initTabLayout();
    }

    void initFragments () {
        if (fragments == null) {
            fragments = new ArrayList<>();
        }

        fragments.add(Test1Fragment.getInstance("Test1Fragment"));
        fragments.add(Test2Fragment.getInstance("Test2Fragment"));
        fragments.add(Test3Fragment.getInstance("Test3Fragment"));
        fragments.add(Test4Fragment.getInstance("Test4Fragment"));
    }

    void initTabLayoutBeans () {
        if (beans == null) {
            beans = new ArrayList<>();
        }

        beans.add(new TabLayoutBean("test1", "XXXXXXX", ""));
        beans.add(new TabLayoutBean("test2", "", ""));
        beans.add(new TabLayoutBean("test3", "", ""));
        beans.add(new TabLayoutBean("test4", "", ""));
    }

    void initTabLayout () {
        tabLayout.setTabData(beans, this, R.id.frame_content, fragments);
        tabLayout.setOnTabSelectListener(onTabSelectListener);
        tabLayout.setCurrentTab(0);
    }

    OnTabSelectListener onTabSelectListener = new OnTabSelectListener() {
        @Override
        public void onTabSelect(int position) {

        }

        @Override
        public void onTabReselect(int position) {

        }
    };

}
