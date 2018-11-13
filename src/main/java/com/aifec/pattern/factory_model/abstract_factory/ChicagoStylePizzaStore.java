package com.aifec.pattern.factory_model.abstract_factory;


import com.aifec.pattern.factory_model.abstract_factory.bean.ChicagoStyleCheesePizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.ChicagoStyleGreekPizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.ChicagoStylePepperoniPizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-12 19:20
 **/

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public com.aifec.pattern.factory_model.abstract_factory.bean.Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }else if("greek".equals(type)){
            pizza = new ChicagoStyleGreekPizza();
        }else if("pepperoni".equals(type)){
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
