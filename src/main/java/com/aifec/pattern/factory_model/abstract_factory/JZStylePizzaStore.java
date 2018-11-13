package com.aifec.pattern.factory_model.abstract_factory;


import com.aifec.pattern.factory_model.abstract_factory.bean.JZStyleCheesePizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.JZStyleGreekPizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.JZStylePepperoniPizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-12 19:20
 **/

public class JZStylePizzaStore extends PizzaStore {
    @Override
    public com.aifec.pattern.factory_model.abstract_factory.bean.Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new JZStyleCheesePizza();
        }else if("greek".equals(type)){
            pizza = new JZStyleGreekPizza();
        }else if("pepperoni".equals(type)){
            pizza = new JZStylePepperoniPizza();
        }
        return pizza;
    }
}
