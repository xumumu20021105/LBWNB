package com.example.data_12_15.factory4;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPool extends IThreadPool{

    private static CustomThreadPool mThreadPool;
    private ThreadPoolExecutor mExecutor;

    public CustomThreadPool() {
        mExecutor = new ThreadPoolExecutor(5, 30, 30, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(),
                Executors.defaultThreadFactory());
    }

    public synchronized static CustomThreadPool getmThreadPool() {
        if(mThreadPool==null){
            synchronized (CustomThreadPool.class){
                if(mThreadPool==null){
                    mThreadPool = new CustomThreadPool();
                }
            }
        }
        return mThreadPool;
    }

    @Override
    public void executeTask(Runnable runnable) {
        super.executeTask(runnable);
        if(mExecutor!=null){
                mExecutor.execute(runnable);
        }
    }

    @Override
    public void removeTask() {

    }

    @Override
    public void removeTask(Runnable runnable) {
        super.removeTask(runnable);
        if(mExecutor!=null){
            mExecutor.remove(runnable);
        }
    }
}
