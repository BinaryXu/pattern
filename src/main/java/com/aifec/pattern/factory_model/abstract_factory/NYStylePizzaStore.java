package com.aifec.pattern.factory_model.abstract_factory;

import com.aifec.pattern.factory_model.abstract_factory.bean.NYStyleCheesePizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.NYStyleGreekPizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.NYStylePepperoniPizza;
import com.aifec.pattern.factory_model.abstract_factory.bean.Pizza;
import com.aifec.pattern.factory_model.abstract_factory.factory.NYPizzaIngredientFactory;
import com.aifec.pattern.factory_model.abstract_factory.factory.PizzaIngredientFactory;

;

/**
 * @author 洪峰
 * @create 2018-11-12 19:20
 **/

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if("cheese".equals(type)){
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
        }else if("greek".equals(type)){
            pizza = new NYStyleGreekPizza();
        }else if("pepperoni".equals(type)){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
