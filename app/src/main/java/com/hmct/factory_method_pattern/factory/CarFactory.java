package com.hmct.factory_method_pattern.factory;

import com.hmct.factory_method_pattern.product.AbstractCar;
import com.hmct.utils.HmctLog;

public class CarFactory extends AbstractCarFactory{
    private static final String TAG = CarFactory.class.getSimpleName();


    @Override
    public <T extends AbstractCar> T createCar(Class<T> c) {
        AbstractCar car = null;
        try {
            car = (AbstractCar) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            HmctLog.d(TAG,"",e);
        }
        return (T)car;
    }
}
