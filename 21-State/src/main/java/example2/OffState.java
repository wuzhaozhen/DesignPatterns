package example2;

public class OffState extends State {
	public void on(Switch s) {
		System.out.println("�򿪣�");
		s.setState(Switch.getState("on"));
	}

	public void off(Switch s) {
		System.out.println("�Ѿ��رգ�");
	}
}
