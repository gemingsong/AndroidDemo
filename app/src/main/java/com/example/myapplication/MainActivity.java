package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hmct.factory_method_pattern.FactoryMethodPatternClient;
import com.hmct.singleton_pattern.SingletonPatternClient;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "gms";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //测试单例模式
//        testSingletonPattern();

//        测试工厂方法模式
        testFactoryMethodPattern();

        //测试抽象工厂模式
//        Client client = new Client();
//        client.testAbstractFactoryMode();

    }

    private void testFactoryMethodPattern(){
        FactoryMethodPatternClient client = new FactoryMethodPatternClient();
        client.createProduct();
    }
//
    private void testSingletonPattern() {
        SingletonPatternClient singletonPatternClient = new SingletonPatternClient();
        singletonPatternClient.getInstance().doSomeThing("I am Singleton Pattern.");

    }
}
