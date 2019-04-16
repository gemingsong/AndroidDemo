package com.hmct.abstract_factory_mode.factory;

import com.hmct.abstract_factory_mode.product.BenzSuvCar;
import com.hmct.abstract_factory_mode.product.BenzTruckCar;
import com.hmct.abstract_factory_mode.product.Icar;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:20
 * @DesCription: This is BenzFactory
 **/

public class BenzFactory implements CarFactory {
    @Override
    public Icar createTruck() {
        return new BenzTruckCar();
    }

    @Override
    public Icar createSuv() {
        return new BenzSuvCar();
    }
}
