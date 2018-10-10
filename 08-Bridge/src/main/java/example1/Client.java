package example1;

import example1.Implementor.Color;
import example1.Implementor.RefinedAbstraction.White;
import example1.abstraction.Pen;
import example1.abstraction.concreteImplementor.SmallPen;

public class Client {
	public static void main(String a[]) {
		Color color = new White();
		Pen pen = new SmallPen();
		pen.setColor(color);
		pen.draw("鲜花");
	}
}