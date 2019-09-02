package com.xw.xwtablayout;

import android.app.Application;

import com.xw.xwtablayoutlib.XWTabLayout;
import com.xw.xwtablayoutlib.XWTabLayoutConfig;

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
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XWTabLayout.init(XWTabLayoutConfig.newBuilder(this)
                .setXWTabLayoutLoader(new CustomTabLayoutLoader())
                .build());
    }
}
