package com.example.data_12_15.factory4;

public class IThreadPoolFactory {
    public static final int CUSTOM_THREADPOOL = 0;
    public static final int SINGLE_THREADPOOL = 1;
    public static final int SCHDULE_THREADPOOL = 2;
    public static IThreadPool getThreadPool(int type){
        switch (type) {
            case CUSTOM_THREADPOOL:
                return CustomThreadPool.getmThreadPool();
            case SINGLE_THREADPOOL:
                return SingleThreadPool.getSingleThreaPool();
            case SCHDULE_THREADPOOL:
                return SchduleThreadPool.getmSchduleThreadPool();
        }
        return null;
    }
}
