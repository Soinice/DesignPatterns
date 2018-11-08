package com.imenger.designpatterns.createdpatterns.factorypattern.Entity;

import com.imenger.designpatterns.createdpatterns.factorypattern.Interface.Shape;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: DesignPatterns
 * @Description: 画一个长方形
 * @date: 2018/11/8 17:42
 */
public class Rectangle implements Shape {

    /**
     * 画形状
     */
    @Override
    public void draw() {
        System.out.println("画了一个长方形。");
    }
}
