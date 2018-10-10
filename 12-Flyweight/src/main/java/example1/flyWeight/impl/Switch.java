package example1.flyWeight.impl;

import example1.flyWeight.NetworkDevice;

public class Switch implements NetworkDevice {
	private String type;

	public Switch(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public void use() {
		System.out.println("Linked by switch, type is " + this.type);
	}
}