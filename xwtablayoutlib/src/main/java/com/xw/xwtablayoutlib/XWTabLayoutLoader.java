package com.xw.xwtablayoutlib;

import android.content.Context;
import android.widget.ImageView;

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
public interface XWTabLayoutLoader {

    XWTabLayoutLoader DEFAULT = new XWTabLayoutLoader() {

        @Override
        public void load(Context context, ImageView view, String url) {

        }
    };

    void load(Context context, ImageView view, String url);
}
