package com.imenger.designpatterns.createdpatterns.factorypattern.entity;

import com.imenger.designpatterns.createdpatterns.factorypattern.interfaces.Shape;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: DesignPatterns
 * @Description: 画一个圈
 * @date: 2018/11/8 17:47
 */
public class Circle implements Shape {

    /**
     * 画形状
     */
    @Override
    public void draw() {
        System.out.println("画了一个圈。");
    }
}
