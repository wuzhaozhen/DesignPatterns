package example1;

import example1.Component.Transform;
import example1.Component.decorator.concrete.Airplane;
import example1.Component.decorator.concrete.Robot;
import example1.Component.concrete.Car;

public class Client {
    public static void main(String args[]) {
        Transform camaro = new Car();
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