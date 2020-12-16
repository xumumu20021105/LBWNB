package com.example.data_12_15.factory3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool implements ThreadPoolInterface {
    private ExecutorService executorService;
    public SingleThreadPool() {
        executorService = Executors.newSingleThreadExecutor();
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
