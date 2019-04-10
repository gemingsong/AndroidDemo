package com.hmct.factory_method_pattern.factory;

import com.hmct.factory_method_pattern.product.AbstractCar;

public abstract class AbstractCarFactory {
    public abstract <T extends AbstractCar> T createCar(Class<T> car);
}
