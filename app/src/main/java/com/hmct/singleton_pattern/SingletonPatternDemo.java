package com.hmct.singleton_pattern;

import com.hmct.utils.HmctLog;

public class SingletonPatternDemo {
    private static final String TAG = "SingletonPatternDemo";

    public SingletonPatternDemo() {

    }

    private static volatile SingletonPatternDemo singleModeTest = null;

    public static SingletonPatternDemo getInstance() {
        if (singleModeTest == null) {
            synchronized (SingletonPatternDemo.class) {
                if (singleModeTest == null) {
                    singleModeTest = new SingletonPatternDemo();
                }
            }
        }
        return singleModeTest;
    }

    public void doSomeThing(String something) {
        HmctLog.d(TAG, " Single Mode Test, will do something:" + something);
    }
}
