package com.hmct.abstract_factory_mode.product;

import com.hmct.utils.HmctLog;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:03
 * @DesCription: This is AbsBenzCar
 **/

public abstract class AbsBenzCar implements Icar {
    private static final String TAG = AbsBenzCar.class.getSimpleName();
    private static final String CAR_NAME = "I am Benz Car.";

    @Override
    public void showCarName() {
        HmctLog.d(TAG, CAR_NAME);
    }

    public abstract void showCarType();
}
