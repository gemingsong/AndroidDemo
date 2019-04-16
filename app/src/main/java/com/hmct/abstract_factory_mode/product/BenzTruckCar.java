package com.hmct.abstract_factory_mode.product;

import com.hmct.utils.HmctLog;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:14
 * @DesCription: This is BenzTruckCar
 **/

public class BenzTruckCar extends AbsBenzCar {
    private static final String TAG = BenzTruckCar.class.getSimpleName();
    private static final String CAR_TYPE = "I am benz truck car.";

    public void showCarType() {
        HmctLog.d(TAG, CAR_TYPE);
    }
}
