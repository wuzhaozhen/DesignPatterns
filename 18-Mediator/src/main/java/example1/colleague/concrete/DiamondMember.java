package example1.colleague.concrete;

import example1.colleague.Member;

public class DiamondMember extends Member {
    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石会员发送信息给" + to + "，内容为：" + message);
        chatroom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("钻石会员发送图片：");
        chatroom.sendImage(name, to, image);
    }

    @Override
    public void receiveText(String from, String message) {
        System.out.println("钻石会员接收信息：" + from + "发送文本给" + name + "，内容为：" + message);
    }

    @Override
    public void receiveImage(String from, String image) {
        System.out.println("钻石会员接收信息：" + from + "发送文本给" + name + "，内容为：" + image);
    }
}