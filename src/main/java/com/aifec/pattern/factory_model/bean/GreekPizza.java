package com.aifec.pattern.factory_model.bean;

/**
 * @author 洪峰
 * @create 2018-11-11 17:29
 * 披萨具体实现类
 **/

public class GreekPizza implements Pizza {
    @Override
    public void prepare() {

        System.out.println("GreekPizza prepare");
    }

    @Override
    public void bake() {

        System.out.println("GreekPizza bake");

    }

    @Override
    public void cut() {

        System.out.println("GreekPizza cut");

    }

    @Override
    public void box() {

        System.out.println("GreekPizza box");

    }
}
