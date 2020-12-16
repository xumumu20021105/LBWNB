package com.example.data_12_15.factory4;

import java.util.concurrent.TimeUnit;

public abstract class IThreadPool {
    public  void executeTask(Runnable runnable){

    }
    public  void executeTimeTask(Runnable runnable, long firstStartTime,
                                 long intervelTime,TimeUnit timeUnit){

    }
    public abstract void removeTask();

    public  void removeTask(Runnable runnable){

    }

}
