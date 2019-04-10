package com.hmct.factory_method_pattern;

import com.hmct.factory_method_pattern.factory.AbstractCarFactory;
import com.hmct.factory_method_pattern.factory.CarFactory;
import com.hmct.factory_method_pattern.product.AbstractCar;
import com.hmct.factory_method_pattern.product.BMWCar;

public class FactoryMethodPatternClient {
    public FactoryMethodPatternClient() {

    }

    public void createProduct() {
        AbstractCarFactory abstractCarFactory = new CarFactory();
        AbstractCar car = abstractCarFactory.createCar(BMWCar.class);
        car.showProduct();
        car.showCarName();
    }
}
