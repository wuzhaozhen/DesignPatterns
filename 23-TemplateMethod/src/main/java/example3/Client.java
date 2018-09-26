package example3;

public class Client {
	public static void main(String a[]) {
		HookDemo hd;

		hd = new SubHookDemo();
		hd.process();
	}
}