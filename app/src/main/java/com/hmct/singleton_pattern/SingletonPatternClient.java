package com.hmct.singleton_pattern;

public class SingletonPatternClient {
    public SingletonPatternClient() {

    }

    public SingletonPatternDemo getInstance() {
        return new SingletonPatternDemo();
    }
}
