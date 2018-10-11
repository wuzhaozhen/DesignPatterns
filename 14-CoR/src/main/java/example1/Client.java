package example1;

import example1.Handler.Leader;
import example1.Handler.Concrete.Director;
import example1.Handler.Concrete.GeneralManager;
import example1.Handler.Concrete.Manager;
import example1.Handler.Concrete.ViceGeneralManager;

public class Client {
	public static void main(String args[]) {
		Leader objDirector, objManager, objGeneralManager, objViceGeneralManager;

		objDirector = new Director("王明");
		objManager = new Manager("赵强");
		objGeneralManager = new GeneralManager("李波");
		objViceGeneralManager = new ViceGeneralManager("肖红");

		objDirector.setSuccessor(objManager);
		objManager.setSuccessor(objViceGeneralManager);
		objViceGeneralManager.setSuccessor(objGeneralManager);

		objDirector.handleRequest("张三", 2);

		objDirector.handleRequest("李四", 5);

		objDirector.handleRequest("王五", 15);

		objDirector.handleRequest("赵六", 30);
	}
}