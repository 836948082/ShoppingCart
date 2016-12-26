package com.runtai.shoppingcart.app;

import android.app.Application;

import com.wanjian.sak.LayoutManager;

/**
 * @作者：高炎鹏
 * @日期：2016/12/26时间11:00
 * @描述：
 */
public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LayoutManager.init((Application) getApplicationContext());
    }

}
