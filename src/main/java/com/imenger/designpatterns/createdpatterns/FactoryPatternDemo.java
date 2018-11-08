package com.imenger.designpatterns.createdpatterns;

import com.imenger.designpatterns.createdpatterns.common.consts.ShapeEnum;
import com.imenger.designpatterns.createdpatterns.factorypattern.Factory.ShapeFactory;
import com.imenger.designpatterns.createdpatterns.factorypattern.Interface.Shape;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: DesignPatterns
 * @Description: 工厂方法模式
 * @date: 2018/11/8 17:37
 */
public interface FactoryPatternDemo {

    /**
     * 工厂方法模式
     *
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle对象，并调用它的draw方法
        Shape circle = shapeFactory.getShape(ShapeEnum.SHAPE_TYPE_CIRCLE.getType());
        circle.draw();

        //获取Square对象，并调用它的draw方法
        Shape square = shapeFactory.getShape(ShapeEnum.SHAPE_TYPE_SQUARE.getType());
        square.draw();

        //获取Rectangle对象，并调用它的draw方法
        Shape rectangle = shapeFactory.getShape(ShapeEnum.SHAPE_TYPE_RECTANGLE.getType());
        rectangle.draw();
    }
}
