package com.xw.xwtablayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * =============================================
 *
 * @author: wlf
 * @date: 2019/9/2
 * @eamil: 845107244@qq.com
 * 描述:
 * 备注:
 * =============================================
 */
public class Test1Fragment extends BaseFragment {

    @BindView(R.id.text)
    TextView textView;

    String title;

    public static Test1Fragment getInstance(String title) {
        Test1Fragment fragment = new Test1Fragment();
        fragment.title = title;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, null);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    void initData () {
        textView.setText(title);
    }
}
