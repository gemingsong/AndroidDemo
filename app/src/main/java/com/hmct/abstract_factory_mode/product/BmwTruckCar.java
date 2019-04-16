package com.hmct.abstract_factory_mode.product;

import com.hmct.utils.HmctLog;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:16
 * @DesCription: This is BmwTruckCar
 **/

public class BmwTruckCar extends AbsBmwCar {
    private static final String TAG = BmwTruckCar.class.getSimpleName();
    private static final String CAR_TYPE = "I am bmw truck car";

    public void showCarType() {
        HmctLog.d(TAG, CAR_TYPE);
    }
}
