package com.aifec.pattern.factory_model.general_factory.bean;


/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 *
 **/

public class ChicagoStylePepperoniPizza extends Pizza{
    @Override
    public void prepare() {

        System.out.println("NYStylePepperoniPizza prepare");
    }

    @Override
    public void bake() {

        System.out.println("NYStylePepperoniPizza bake");

    }

    @Override
    public void cut() {

        System.out.println("NYStylePepperoniPizza cut");

    }

    @Override
    public void box() {

        System.out.println("NYStylePepperoniPizza box");

    }
}
