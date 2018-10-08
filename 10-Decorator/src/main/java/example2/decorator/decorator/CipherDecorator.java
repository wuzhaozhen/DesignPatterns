package example2.decorator.decorator;

import example2.decorator.Cipher;

public class CipherDecorator implements Cipher {
	private Cipher cipher;

	public CipherDecorator(Cipher cipher) {
		this.cipher = cipher;
	}
	
	@Override
	public String encrypt(String plainText) {
		return cipher.encrypt(plainText);
	}
}
