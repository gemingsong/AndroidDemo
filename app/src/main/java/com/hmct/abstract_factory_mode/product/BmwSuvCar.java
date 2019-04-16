package com.hmct.abstract_factory_mode.product;

import com.hmct.utils.HmctLog;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:16
 * @DesCription: This is BmwSuvCar
 **/

public class BmwSuvCar extends AbsBmwCar {
    private static final String TAG = BmwSuvCar.class.getSimpleName();
    private static final String CAR_TYPE = "I am bmw suv car";

    public void showCarType() {
        HmctLog.d(TAG, CAR_TYPE);
    }
}
