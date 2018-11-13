package com.aifec.pattern.factory_model.abstract_factory.factory;

/**
 * @author 洪峰
 * @create 2018-11-13 20:32
 * 创建原材料工厂
 * 抽象工厂模式
 *
 *                  抽象工厂
 *              *             *
 *          *                    *
 *      *                           *
 * 纽约工厂                          芝加哥区域工厂
 *
 *
 *
 **/

public interface PizzaIngredientFactory {

    public Dough createDougtt();

    public Sauce createSauce();

}
