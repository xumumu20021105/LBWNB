package com.example.data_12_15.factory3;

import com.example.data_12_15.factory4.CustomThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool implements ThreadPoolInterface {
    private static CustomThreadPool mThreadPool;
    private ExecutorService executorService;

    public CacheThreadPool() {
        executorService = Executors.newCachedThreadPool();
    }

    @Override
    public void executeTask(Runnable runnable) {
        if(executorService!=null)
            executorService.execute(runnable);
    }

    @Override
    public void removeTask() {
        if(executorService!=null)
            executorService.shutdown();
    }
}
