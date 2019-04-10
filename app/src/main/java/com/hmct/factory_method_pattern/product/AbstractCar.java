package com.hmct.factory_method_pattern.product;

import com.hmct.utils.HmctLog;

public abstract class AbstractCar {
    private static final String TAG = AbstractCar.class.getSimpleName();

    public void showProduct() {
        HmctLog.d(TAG,"we are car product");
    }

    public abstract void showCarName();
}
