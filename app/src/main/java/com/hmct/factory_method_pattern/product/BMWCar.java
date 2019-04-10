package com.hmct.factory_method_pattern.product;

import com.hmct.utils.HmctLog;

public class BMWCar extends AbstractCar {
    private static final String CAR_NAME = "I am bmw car.";

    public void showCarName() {
        HmctLog.d("BMWCar", CAR_NAME);
    }
}
