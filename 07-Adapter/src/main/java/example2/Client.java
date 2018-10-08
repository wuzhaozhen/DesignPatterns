package example2;

import example2.adapter.CipherAdapter;
import example2.adapter.NewCipherAdapter;
import example2.destination.DataOperation;

public class Client {
	public static void main(String args[]) {
		DataOperation dao = new CipherAdapter();
		dao.setPassword("sunnyLiu");
		String ps = dao.getPassword();
		String es = dao.doEncrypt(6, ps);
		System.out.println("明文为：" + ps);
		System.out.println("密文为：" + es);
		
		dao = new NewCipherAdapter();
		dao.setPassword("sunnyLiu");
		ps = dao.getPassword();
		es = dao.doEncrypt(6, ps);
		System.out.println("明文为：" + ps);
		System.out.println("密文为：" + es);
	}
}
