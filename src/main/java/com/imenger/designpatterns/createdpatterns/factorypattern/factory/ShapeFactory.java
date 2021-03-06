package com.imenger.designpatterns.createdpatterns.factorypattern.factory;

import com.imenger.designpatterns.createdpatterns.common.consts.ShapeEnum;
import com.imenger.designpatterns.createdpatterns.factorypattern.entity.Circle;
import com.imenger.designpatterns.createdpatterns.factorypattern.entity.Rectangle;
import com.imenger.designpatterns.createdpatterns.factorypattern.entity.Square;
import com.imenger.designpatterns.createdpatterns.factorypattern.interfaces.Shape;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: DesignPatterns
 * @Description: 形状工厂
 * @date: 2018/11/8 17:51
 */
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(ShapeEnum.SHAPE_TYPE_CIRCLE.getType())) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase(ShapeEnum.SHAPE_TYPE_SQUARE.getType())) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase(ShapeEnum.SHAPE_TYPE_RECTANGLE.getType())) {
            return new Rectangle();
        }
        return null;
    }
}
