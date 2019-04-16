package com.hmct.abstract_factory_mode.factory;

import com.hmct.abstract_factory_mode.product.BmwSuvCar;
import com.hmct.abstract_factory_mode.product.BmwTruckCar;
import com.hmct.abstract_factory_mode.product.Icar;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:22
 * @DesCription: This is BmwFactory
 **/

public class BmwFactory implements CarFactory {
    @Override
    public Icar createSuv() {
        return new BmwSuvCar();
    }

    @Override
    public Icar createTruck() {
        return new BmwTruckCar();
    }
}
