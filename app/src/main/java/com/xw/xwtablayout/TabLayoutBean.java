package com.xw.xwtablayout;

import com.xw.xwtablayoutlib.listener.CustomTabEntity;

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
public class TabLayoutBean implements CustomTabEntity {

    private String title;

    private int selectIcon;
    private int unSelectIcon;

    private String selectUrl;
    private String unSelectUrl;

    public TabLayoutBean (String title, int selectIcon, int unSelectIcon) {
        this.title = title;
        this.selectIcon = selectIcon;
        this.unSelectIcon = unSelectIcon;
    }

    public TabLayoutBean (String title, String selectUrl, String unSelectUrl) {
        this.title = title;
        this.selectUrl = selectUrl;
        this.unSelectUrl = unSelectUrl;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectIcon;
    }

    @Override
    public String getTabSelectUrl() {
        return selectUrl;
    }

    @Override
    public String getTabUnSelectUrl() {
        return unSelectUrl;
    }
}
