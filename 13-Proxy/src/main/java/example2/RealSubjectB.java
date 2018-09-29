package example2;

public class RealSubjectB implements AbstractSubject {
	public void request() {
		System.out.println("真实主题类B！");
	}

	@Override
	public void response() {
		System.out.println("真实主题类B2！");
	}
}