package com.imenger.designpatterns.createdpatterns.common.consts;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: DesignPatterns
 * @Description: 形状枚举
 * @date: 2018/11/8 18:18
 */
public enum ShapeEnum {

    /**
     * 形状类型
     */
    SHAPE_TYPE_CIRCLE("CIRCLE", "圈"),
    SHAPE_TYPE_SQUARE("SQUARE", "正方形"),
    SHAPE_TYPE_RECTANGLE("RECTANGLE", "长方形");

    public String type;
    public String description;

    ShapeEnum(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
