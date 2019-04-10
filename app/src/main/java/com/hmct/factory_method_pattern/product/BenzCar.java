package com.hmct.factory_method_pattern.product;

import com.hmct.utils.HmctLog;

public class BenzCar extends AbstractCar {
    private static final String TAG = BenzCar.class.getSimpleName();
    private static final String CAR_NAME = "I am Benz car.";

    @Override
    public void showCarName() {
        HmctLog.d(TAG, CAR_NAME);
    }
}
