package example1.colleague.concrete;

import example1.colleague.Member;

public class CommonMember extends Member {
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送信息：");
        chatroom.sendText(name, to, message); // 发送
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不能发送图片！");
    }

    @Override
    public void receiveText(String from, String message) {
        System.out.println("普通会员接收信息：" + from + "发送文本给" + name + "，内容为：" + message);
    }

    @Override
    public void receiveImage(String from, String image) {
        System.out.println("普通会员接收图片：" + from + "发送文本给" + name + "，内容为：" + image);
    }
}