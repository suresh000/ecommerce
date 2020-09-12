package com.bjmasc.ecommerce;

import android.content.Context;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.bjmasc.ecommerce.util.helper.ExceptionHelper;
import com.bjmasc.ecommerce.util.helper.LogHelper;

public class AppController extends MultiDexApplication {

    private static AppController mInstance;

    public static synchronized AppController getInstance() {
        return mInstance;
    }

    @Override
    public synchronized void onCreate() {
        super.onCreate();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        LogHelper.setLog(!BuildConfig.IS_PROD || BuildConfig.DEBUG);
        ExceptionHelper.setException(!BuildConfig.IS_PROD || BuildConfig.DEBUG);
    }
}
