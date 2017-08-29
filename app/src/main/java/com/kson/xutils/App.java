package com.kson.xutils;

import android.app.Application;

import org.xutils.x;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2017/08/29
 * Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initXutils();
        initImageloader();
    }

    private void initImageloader() {

    }

    private void initXutils() {
        x.Ext.init(this);







    }
}
