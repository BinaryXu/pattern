package com.aifec.pattern.factory_model.simple_factory;


import com.aifec.pattern.factory_model.simple_factory.bean.Pizza;

/**
 * @author 洪峰
 * @create 2018-11-11 17:38
 *
 * 简单工厂模式实现
 *
 **/

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = null;

        /**
         *
         * 如果新增一种披萨的类型，会在代码中增加，违反了对修改封闭的原则
         * 所以把这部分变化的代码提取出来
         * 因为这里只是在这一个方法中用到，如果在多个方法中用到，就可以体现出简单工厂模式的作用
         *
         */
        /*if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("greek".equals(type)){
            pizza = new GreekPizza();
        }else if("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }*/


        //优化后的方法
        pizza = factory.createPizza(type);

        //每种披萨的制作过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;


    }
}
