package example2;

public class OnState extends State {
	public void on(Switch s) {
		System.out.println("�Ѿ��򿪣�");
	}

	public void off(Switch s) {
		System.out.println("�رգ�");
		s.setState(Switch.getState("off"));

	}
}
