package com.example.data_12_15.factory4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchduleThreadPool extends IThreadPool{
    private static SchduleThreadPool mSchduleThreadPool;
    private final ScheduledExecutorService mExecuteService;

    @Override
    public void executeTimeTask(Runnable runnable, long firstStartTime, long intervelTime, TimeUnit timeUnit) {
        super.executeTimeTask(runnable, firstStartTime, intervelTime, timeUnit);
    }

    public SchduleThreadPool() {
        mExecuteService = Executors.newSingleThreadScheduledExecutor();
    }

    public synchronized static SchduleThreadPool getmSchduleThreadPool() {
        if(mSchduleThreadPool==null){
            synchronized (SchduleThreadPool.class){
                if(mSchduleThreadPool==null){
                    mSchduleThreadPool= new SchduleThreadPool();
                }
            }
        }
        return mSchduleThreadPool;
    }

    @Override
    public void removeTask() {

    }
}
