package example1;

import example1.decorator.Transform;
import example1.decorator.decorator.impl.Airplane;
import example1.decorator.decorator.impl.Robot;
import example1.decorator.impl.Car;

public class Client {
	public static void main(String args[]) {
		Transform camaro;
		camaro = new Car();
		camaro.move();
		System.out.println("-----------------------------");

		Airplane bumblebee = new Airplane(camaro);
		bumblebee.move();
		bumblebee.fly();
		System.out.println("-----------------------------");
		
		Robot robot = new Robot(camaro);
		robot.move();
		robot.say();
	}
}