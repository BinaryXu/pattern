package com.aifec.pattern.factory_model.abstract_factory.bean;


/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 **/

public class ChicagoStyleGreekPizza extends Pizza {
    @Override
    public void prepare() {

        System.out.println("NYStyleGreekPizza prepare");
    }

    @Override
    public void bake() {

        System.out.println("NYStyleGreekPizza bake");

    }

    @Override
    public void cut() {

        System.out.println("NYStyleGreekPizza cut");

    }

    @Override
    public void box() {

        System.out.println("NYStyleGreekPizza box");

    }
}
