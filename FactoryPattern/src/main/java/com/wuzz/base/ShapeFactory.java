package com.wuzz.base;

import com.wuzz.service.Shape;
import com.wuzz.service.impl.Circle;
import com.wuzz.service.impl.Rectangle;
import com.wuzz.service.impl.Square;

/**
 * 图形工厂
 * 
 * @author wuzz
 * @date 2018年9月19日 上午10:53:27
 */
public class ShapeFactory {
	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
