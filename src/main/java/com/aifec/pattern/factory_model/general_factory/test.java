package com.aifec.pattern.factory_model.general_factory;

import com.aifec.pattern.factory_model.general_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-12 19:35
 **/

public class test {

    public static void main(String[] args) {
        PizzaStore store = new NYStylePizzaStore();
        Pizza pizza =  store.orderPizza("cheese");

        System.out.println(pizza.getName());

    }


}
