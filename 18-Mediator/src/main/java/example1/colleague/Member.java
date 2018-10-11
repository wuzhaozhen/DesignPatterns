package example1.colleague;

import example1.mediator.AbstractChatroom;

public abstract class Member {
    protected AbstractChatroom chatRoom;
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractChatroom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(AbstractChatroom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String image);

    public abstract void receiveText(String from, String message);

    public abstract void receiveImage(String from, String image);
}