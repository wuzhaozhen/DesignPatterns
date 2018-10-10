package example1;

import example1.adapter.BirdAdapter;
import example1.adapter.DogAdapter;
import example1.target.Robot;

public class Client {
	public static void main(String args[]) {
		Robot robot = new BirdAdapter();
		robot.cry();
		robot.move();
		robot=new DogAdapter();
		robot.cry();
		robot.move();
	}
}