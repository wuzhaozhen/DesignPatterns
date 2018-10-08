package example3.proxy.proxy;

import example3.proxy.impl.RealPermission;

public class PermissionProxy extends RealPermission {
	private int level = 0;

	@Override
	public void modifyUserInfo() {
		if (0 == level) {
			System.out.println("对不起，你没有该权限!");
		} else if (1 == level) {
			super.modifyUserInfo();
		}
	}

	@Override
	public void viewNote() {
		System.out.println("查看帖子！");
	}

	@Override
	public void publishNote() {
		if (0 == level) {
			System.out.println("对不起，你没有该权限!");
		} else if (1 == level) {
			super.publishNote();
		}
	}

	@Override
	public void modifyNote() {
		if (0 == level) {
			System.out.println("对不起，你没有该权限!");
		} else if (1 == level) {
			super.modifyNote();
		}
	}

	@Override
	public void setLevel(int level) {
		this.level = level;
	}
}