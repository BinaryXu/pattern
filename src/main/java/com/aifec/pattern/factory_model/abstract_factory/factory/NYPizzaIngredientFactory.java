package com.aifec.pattern.factory_model.abstract_factory.factory;

/**
 * @author 洪峰
 * @create 2018-11-13 20:39
 **/

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDougtt() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSause();
    }
}
