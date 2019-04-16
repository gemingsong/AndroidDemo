package com.hmct.abstract_factory_mode.factory;

import com.hmct.abstract_factory_mode.product.Icar;

public interface CarFactory {
    public Icar createSuv();

    public Icar createTruck();
}
