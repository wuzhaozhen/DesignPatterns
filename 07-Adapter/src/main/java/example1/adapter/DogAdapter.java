package example1.adapter;

import example1.destination.Robot;
import example1.source.Dog;

/**
 * 狗的适配器
 * 
 * @author wuzz
 * @date 2018年10月8日 下午1:58:01
 */
public class DogAdapter extends Dog implements Robot {

	@Override
	public void cry() {
		System.out.print("机器人模仿：");
		super.wang();
	}

	@Override
	public void move() {
		System.out.print("机器人模仿：");
		super.run();
	}
}