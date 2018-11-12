package com.aifec.pattern.factory_model.simple_factory;

import com.aifec.pattern.factory_model.simple_factory.bean.CheesePizza;
import com.aifec.pattern.factory_model.simple_factory.bean.GreekPizza;
import com.aifec.pattern.factory_model.simple_factory.bean.PepperoniPizza;
import com.aifec.pattern.factory_model.simple_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-11 17:49
 **/

public class SimplePizzaFactory {

    /**
     * 该方法为工厂，可以为多个方法进行调用
     * @param type
     * @return
     */
    public Pizza createPizza(String type){

        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("greek".equals(type)){
            pizza = new GreekPizza();
        }else if("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }

        return pizza;
    }

}
