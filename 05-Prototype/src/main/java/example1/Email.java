package example1;

public class Email implements Cloneable {
	private Attachment attachment = null;
	private String name;
	private int age;

	public Email(String name, int age) {
		this.attachment = new Attachment();
		this.name = name;
		this.age = age;
	}

	@Override
	public Object clone() {
		Email clone = null;
		try {
			clone = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone failure!");
		}
		return clone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void display() {
		System.out.println("查看邮件");
	}

}