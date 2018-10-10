package example1;

public class Attachment {
	public void download(Email email) {
		System.out.println(email.getName() + "今年" + email.getAge() + "岁,下载附件");
	}
}