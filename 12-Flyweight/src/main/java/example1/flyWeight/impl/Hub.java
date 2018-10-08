package example1.flyWeight.impl;

import example1.flyWeight.NetworkDevice;

public class Hub implements NetworkDevice {
	private String type;

	public Hub(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public void use() {
		System.out.println("Linked by Hub, type is " + this.type);
	}
}