package example1.colleague.concrete;

import example1.colleague.Member;

public class DiamondMember extends Member {
	public DiamondMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("钻石会员发送信息：");
		chatroom.sendText(name, to, message); // 发送
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("钻石会员发送图片：");
		chatroom.sendImage(name, to, image); // 发送
	}
}