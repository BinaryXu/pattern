package com.aifec.pattern.factory_model.general_factory.bean;

import java.util.ArrayList;

/**
 * @author 洪峰
 * @create 2018-11-12 19:53
 **/

public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("Prepare"+name);
        System.out.println("Tossing dough...");
        System.out.println("adding sacue...");
        System.out.println("adding topping");
        for (int i = 0; i < toppings.size() ; i++) {
            System.out.println(toppings.get(i));
        }
    }

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
