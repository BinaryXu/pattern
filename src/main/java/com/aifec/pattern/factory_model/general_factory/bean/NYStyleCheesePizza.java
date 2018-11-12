package com.aifec.pattern.factory_model.general_factory.bean;


import com.aifec.pattern.factory_model.general_factory.NYStylePizzaStore;

/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 *
 **/

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY style sauce and chesse Pizza";
        dough = "Thin Ctust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
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
