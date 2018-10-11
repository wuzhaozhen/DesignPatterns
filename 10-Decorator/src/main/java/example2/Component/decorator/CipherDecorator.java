package example2.Component.decorator;

import example2.Component.Cipher;

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
