package example1.Component.concrete;

import example1.Component.Transform;

/**
 * 具体实现类
 *
 * @author wuzz
 * @date 2018年10月8日 下午2:50:32
 */
public final class Car implements Transform {

    public Car() {
        System.out.println("变形金刚是一辆车！");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动！");
    }
}