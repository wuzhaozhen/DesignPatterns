package example2.adapter;

import example2.destination.DataOperation;
import example2.source.NewCipher;

public class NewCipherAdapter extends DataOperation {
	private NewCipher cipher;

	public NewCipherAdapter() {
		cipher = new NewCipher();
	}

	@Override
	public String doEncrypt(int key, String ps) {
		return cipher.doEncrypt(key, ps);
	}

}
