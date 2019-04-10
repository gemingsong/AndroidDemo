package com.example.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hmct.abstract_factory_mode.client.Client;
import com.hmct.factory_method.CarFactory;
import com.hmct.singleton_pattern.SingletonPatternClient;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "gms";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //测试单例模式
        testSingletonPattern();



//        testSingleMode();
        //测试工厂方法模式
//        testFactoryMethodMode();

        //测试抽象工厂模式
//        Client client = new Client();
//        client.testAbstractFactoryMode();

    }

//    private void testFactoryMethodMode(){
//        CarFactory carFactory = new CarFactory();
//        carFactory.createCar("BenZ");
//        carFactory.createCar("bmw");
//    }
//
    private void testSingletonPattern() {
        SingletonPatternClient singletonPatternClient = new SingletonPatternClient();
        singletonPatternClient.getInstance().doSomeThing("I am Singleton Pattern.");

    }
}
