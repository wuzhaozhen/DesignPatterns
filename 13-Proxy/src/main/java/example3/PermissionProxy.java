package example3;

public class PermissionProxy extends RealPermission {
	private int level = 0;

	public void modifyUserInfo() {
		if (0 == level) {
			System.out.println("对不起，你没有该权限!");
		} else if (1 == level) {
			super.modifyUserInfo();
		}
	}

	public void viewNote() {
		System.out.println("查看帖子！");
	}

	public void publishNote() {
		if (0 == level) {
			System.out.println("对不起，你没有该权限!");
		} else if (1 == level) {
			super.publishNote();
		}
	}

	public void modifyNote() {
		if (0 == level) {
			System.out.println("对不起，你没有该权限!");
		} else if (1 == level) {
			super.modifyNote();
		}
	}

	public void setLevel(int level) {
		this.level = level;
	}
}