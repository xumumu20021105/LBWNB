package com.example.data_12_15.sginle;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolManager {

//    private ThreadPoolManager mManager = new ThreadPoolManager();
//
//    private ThreadPoolManager(){
//
//    }
//
//    public ThreadPoolManager getmManager() {
//        return mManager;
//    }
    private ThreadPoolExecutor mExecutor;
    private static ThreadPoolManager mManager;

    private ThreadPoolManager(){
        mExecutor = new ThreadPoolExecutor(5,20,30,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(),
                Executors.defaultThreadFactory());
    }

    public synchronized static ThreadPoolManager getmManager() {
        if(mManager== null){
            synchronized (ThreadPoolExecutor.class){
                if(mManager==null){
                    mManager = new ThreadPoolManager();
                }
            }
        }
        return mManager;
    }
    public void executeTask(Runnable runnable){
        if(mExecutor == null){
            return;
        }
        mExecutor.execute(runnable);
    }

    public void removeTask(Runnable runnable){
        if(mExecutor == null){
            return;
        }
        mExecutor.remove(runnable);
    }
}
