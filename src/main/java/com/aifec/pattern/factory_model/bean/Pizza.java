package com.aifec.pattern.factory_model.bean;

/**
 * @author 洪峰
 * @create 2018-11-11 17:24
 *
 * 披萨制造流程类接口
 *
 **/

public interface Pizza {

    void prepare();

    void bake();

    void cut();

    void box();

}
