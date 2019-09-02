package com.xw.xwtablayout;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xw.xwtablayoutlib.XWTabLayoutLoader;

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
public class CustomTabLayoutLoader implements XWTabLayoutLoader {

    @Override
    public void load(Context context, ImageView view, String url) {
        Glide.with(context)
                .load(url)
                .into(view);
    }
}
