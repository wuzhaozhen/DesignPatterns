package example2;

import example2.flyWeight.NetworkDevice;
import example2.flyWeight.flyWeight.DeviceFactory;

public class Client {
	public static void main(String args[]) {
		NetworkDevice nd1, nd2, nd3, nd4, nd5;
		DeviceFactory df = new DeviceFactory();

		nd1 = df.getNetworkDevice("cisco");
		nd1.use("1000");

		nd2 = df.getNetworkDevice("cisco");
		nd2.use("1001");

		nd3 = df.getNetworkDevice("cisco");
		nd3.use("1002");

		nd4 = df.getNetworkDevice("tp");
		nd4.use("1003");

		nd5 = df.getNetworkDevice("tp");
		nd5.use("1004");

		System.out.println("Total Device:" + df.getTotalDevice());
		System.out.println("Total Terminal:" + df.getTotalTerminal());
	}
}