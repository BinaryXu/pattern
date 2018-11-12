package com.aifec.pattern.factory_model.general_factory;

import com.aifec.pattern.factory_model.general_factory.bean.NYStyleCheesePizza;
import com.aifec.pattern.factory_model.general_factory.bean.NYStyleGreekPizza;
import com.aifec.pattern.factory_model.general_factory.bean.NYStylePepperoniPizza;
import com.aifec.pattern.factory_model.general_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-12 19:20
 **/

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new NYStyleCheesePizza();
        }else if("greek".equals(type)){
            pizza = new NYStyleGreekPizza();
        }else if("pepperoni".equals(type)){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
