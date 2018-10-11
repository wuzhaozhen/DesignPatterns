package example1;

import example1.colleague.Member;
import example1.colleague.concrete.CommonMember;
import example1.colleague.concrete.DiamondMember;
import example1.mediator.AbstractChatroom;
import example1.mediator.concrete.ChatGroup;

public class Client {
	public static void main(String args[]) {
		AbstractChatroom happyChat = new ChatGroup();
		Member member1, member2, member3, member4, member5;
		member1 = new DiamondMember("张三");
		member2 = new DiamondMember("李四");
		member3 = new CommonMember("王五");
		member4 = new CommonMember("小芳");
		member5 = new CommonMember("小红");

		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);

		member1.sendText("小芳","你好！");

	}
}