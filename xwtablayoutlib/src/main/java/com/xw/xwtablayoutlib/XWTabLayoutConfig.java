package com.xw.xwtablayoutlib;

import android.content.Context;

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
public class XWTabLayoutConfig {

    public static Builder newBuilder (Context context) {
        return new Builder(context);
    }

    private XWTabLayoutLoader mLoader;

    private XWTabLayoutConfig (Builder builder) {
        this.mLoader = builder.mLoader == null ? XWTabLayoutLoader.DEFAULT : builder.mLoader;
    }

    public XWTabLayoutLoader getXWTabLayoutLoader () {
        return mLoader;
    }

    public static final class Builder {

        private XWTabLayoutLoader mLoader;

        private Builder (Context context) {}

        public Builder setXWTabLayoutLoader (XWTabLayoutLoader loader) {
            this.mLoader = loader;
            return this;
        }

        public XWTabLayoutConfig build () {
            return new XWTabLayoutConfig(this);
        }
    }
}
