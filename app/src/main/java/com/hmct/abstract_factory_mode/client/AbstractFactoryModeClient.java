package com.hmct.abstract_factory_mode.client;

import com.hmct.abstract_factory_mode.factory.BenzFactory;
import com.hmct.abstract_factory_mode.factory.BmwFactory;
import com.hmct.abstract_factory_mode.factory.CarFactory;
import com.hmct.abstract_factory_mode.product.Icar;

/**
 * @Author: gemingsong
 * @Date: 2019-2019/4/9 14:35
 * @DesCription: This is AbstractFactoryModeClient
 **/

public class AbstractFactoryModeClient {
    public AbstractFactoryModeClient() {}

    public void testAbstractFactoryMode(){
        //初始化工厂
        CarFactory benzFactory = new BenzFactory();
        //工厂生产出一种类型的车
        Icar benzCar = benzFactory.createSuv();
        //车输出属性
        benzCar.showCarName();
        benzCar.showCarType();

        benzCar = benzFactory.createTruck();
        benzCar.showCarName();
        benzCar.showCarType();


        CarFactory bmwFactory = new BmwFactory();
        Icar bmwCar = bmwFactory.createSuv();
        bmwCar.showCarName();
        bmwCar.showCarType();
        bmwCar = bmwFactory.createTruck();
        bmwCar.showCarName();
        bmwCar.showCarType();
    }
}
