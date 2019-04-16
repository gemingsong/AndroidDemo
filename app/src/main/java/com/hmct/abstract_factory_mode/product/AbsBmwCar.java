package com.hmct.abstract_factory_mode.product;

import com.hmct.utils.HmctLog;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:03
 * @DesCription: This is AbsBenzCar
 **/

public abstract class AbsBmwCar implements Icar {
    private static final String TAG = AbsBmwCar.class.getSimpleName();
    private static final String CAR_NAME = "I am bmw Car.";

    @Override
    public void showCarName() {
        HmctLog.d(TAG, CAR_NAME);
    }


    public abstract void showCarType();
}
