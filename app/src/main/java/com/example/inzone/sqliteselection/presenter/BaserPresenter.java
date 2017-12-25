package com.example.inzone.sqliteselection.presenter;

import android.os.Looper;

import com.example.inzone.sqliteselection.BaseApplication;

/**
 * Created by zouyingjun on 2017/12/25.
 * 异步任务基类
 */

public class BaserPresenter {

    /**
     * 在ui线程中执行
     * @param runnable
     */
    protected void runOnUI(Runnable runnable){
        if(runnable == null){
            return;
        }

        if(Thread.currentThread() == Looper.getMainLooper().getThread()){
            runnable.run();
        }else{
            BaseApplication.getHandler().post(runnable);
        }
    }
}
