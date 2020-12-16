package com.example.data_12_15.factory3;

public interface ThreadPoolInterface {
    void executeTask(Runnable runnable);
    void removeTask();
}
