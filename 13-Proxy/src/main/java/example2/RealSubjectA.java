package example2;

public class RealSubjectA implements AbstractSubject {
	public void request() {
		System.out.println("真实主题类A！");
	}

	@Override
	public void response() {
		System.out.println("真实主题类A2！");
	}
}