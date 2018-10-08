package example2.adapter;

import example2.destination.DataOperation;
import example2.source.Caesar;

public class CipherAdapter extends DataOperation {
	private Caesar cipher;

	public CipherAdapter() {
		cipher = new Caesar();
	}

	@Override
	public String doEncrypt(int key, String ps) {
		return cipher.doEncrypt(key, ps);
	}
}