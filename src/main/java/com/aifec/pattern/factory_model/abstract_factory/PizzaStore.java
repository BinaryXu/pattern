package com.aifec.pattern.factory_model.abstract_factory;


import com.aifec.pattern.factory_model.abstract_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-11 17:38
 *
 * 工厂模式实现
 *
 **/

public abstract class PizzaStore {


    public Pizza orderPizza(String type){

        Pizza pizza = null;

        //优化后的方法
        pizza = createPizza(type);

        //每种披萨的制作过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;


    }

    abstract com.aifec.pattern.factory_model.abstract_factory.bean.Pizza createPizza(String type);
}
