package com.aifec.pattern.factory_model.abstract_factory.bean;


import com.aifec.pattern.factory_model.abstract_factory.factory.PizzaIngredientFactory;

/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 *
 **/

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing"+name);
        pizzaIngredientFactory.createDougtt();
        pizzaIngredientFactory.createSauce();

    }

    @Override
    public void bake() {

        System.out.println("NYStyleCheesePizza bake");

    }

    @Override
    public void cut() {

        System.out.println("NYStyleCheesePizza cut");

    }

    @Override
    public void box() {

        System.out.println("NYStyleCheesePizza box");

    }
}
