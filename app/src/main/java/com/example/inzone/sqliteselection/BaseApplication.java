package com.example.inzone.sqliteselection;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;


/**
 * Created by Administrator on 2017/12/25.
 */

public class BaseApplication extends Application {

    private static Handler mHandler;

    public static Handler getHandler(){
        if(mHandler == null){
            mHandler = new Handler(Looper.getMainLooper());
        }
        return mHandler;
    }
}
