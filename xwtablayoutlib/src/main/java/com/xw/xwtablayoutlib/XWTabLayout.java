package com.xw.xwtablayoutlib;

import android.util.Log;

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
public class XWTabLayout {

    private static XWTabLayoutConfig mConfig;

    public static void init (XWTabLayoutConfig config) {
        if (mConfig == null) {
            mConfig = config;
        }else {
            Log.w("XWTabLayout", new IllegalStateException("Illegal operation, only allowed to configure once."));
        }
    }

    public static XWTabLayoutConfig getXWTabLayoutConfig() {
        if (mConfig == null) {
            mConfig = XWTabLayoutConfig.newBuilder(null).build();
        }
        return mConfig;
    }
}
