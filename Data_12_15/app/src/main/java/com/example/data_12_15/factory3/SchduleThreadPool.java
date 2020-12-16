package com.example.data_12_15.factory3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchduleThreadPool implements ThreadPoolInterface {
    private ScheduledExecutorService executorService;
    public SchduleThreadPool() {
        executorService = Executors.newSingleThreadScheduledExecutor();
    }

    @Override
    public void executeTask(Runnable runnable) {
        if(executorService!=null)
            executorService.schedule(runnable,2, TimeUnit.SECONDS);
    }

    @Override
    public void removeTask() {
        if(executorService!=null)
            executorService.shutdown();
    }
}
