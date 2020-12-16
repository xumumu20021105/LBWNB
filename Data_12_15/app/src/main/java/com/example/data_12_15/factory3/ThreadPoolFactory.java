package com.example.data_12_15.factory3;

public class ThreadPoolFactory {
    public static final int CACHE_THREADPOOL = 0;
    public static final int FIXED_THREADPOOL = 1;
    public static final int SCHDULE_THREADPOOL = 2;
    public static final int SINGLE_THREADPOOL = 3;

    public static ThreadPoolInterface getExecutor(int type) {
        switch (type) {
            case CACHE_THREADPOOL:
                return new CacheThreadPool();

            case FIXED_THREADPOOL:
                return new FixedThreadPool();

            case SCHDULE_THREADPOOL:
                return new SchduleThreadPool();

            case SINGLE_THREADPOOL:
                return new SingleThreadPool();

        }
        return null;
    }
}
