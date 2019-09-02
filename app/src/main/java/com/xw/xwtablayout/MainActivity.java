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

        beans.add(new TabLayoutBean("test1", "https://osscdn.jipaibuy.com/itam/rest/test/14599229d540fe2360b4ff8bd30d7fce43061ad.png",
                "https://osscdn.jipaibuy.com/itam/rest/test/7098879a1d24935de7241c885d18155af7e3330.png"));
        beans.add(new TabLayoutBean("test2", "https://osscdn.jipaibuy.com/itam/rest/test/71506505920caf6e34245b9bc3502a92b1b16cd.png",
                "https://osscdn.jipaibuy.com/itam/rest/test/7135895db0f6bf7e1834bf1aa56b5db6bb38250.png"));
        beans.add(new TabLayoutBean("test3", "https://osscdn.jipaibuy.com/itam/rest/test/7184846c24a2e2c28c645a49307a0e798da29e0.png",
                "https://osscdn.jipaibuy.com/itam/rest/test/717256474c143ffbfcd48918e28abaffe616936.png"));
        beans.add(new TabLayoutBean("test4", "https://osscdn.jipaibuy.com/itam/rest/test/72122940352f177177a4e21b7a95a9503146080.png",
                "https://osscdn.jipaibuy.com/itam/rest/test/7200134123af860e1f14a848de5fcdf4adbf121.png"));
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
