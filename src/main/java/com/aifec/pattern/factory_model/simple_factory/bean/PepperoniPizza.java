package com.aifec.pattern.factory_model.simple_factory.bean;

/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 *
 **/

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {

        System.out.println("PepperoniPizza prepare");
    }

    @Override
    public void bake() {

        System.out.println("PepperoniPizza bake");

    }

    @Override
    public void cut() {

        System.out.println("PepperoniPizza cut");

    }

    @Override
    public void box() {

        System.out.println("PepperoniPizza box");

    }
}
