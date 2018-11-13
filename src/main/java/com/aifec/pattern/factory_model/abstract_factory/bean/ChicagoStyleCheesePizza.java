package com.aifec.pattern.factory_model.abstract_factory.bean;


/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 *
 **/

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {

        System.out.println("NYStyleCheesePizza prepare");
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
