package com.aifec.pattern.factory_model.abstract_factory.bean;

import java.util.ArrayList;

/**
 * @author 洪峰
 * @create 2018-11-12 19:53
 *
 **/

public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    //实现抽象方法供底层工厂调用
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minues at 350");
    }

    public void cut(){
        System.out.println("cut Pizza");
    }
    public void box(){
        System.out.println("box Pizza");
    }
    public String getName(){
        return name;
    }

}
