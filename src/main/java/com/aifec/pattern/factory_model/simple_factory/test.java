package com.aifec.pattern.factory_model.simple_factory;

import com.aifec.pattern.factory_model.simple_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-12 21:26
 **/

public class test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        System.out.println(pizzaStore.orderPizza("cheese"));
    }
}
