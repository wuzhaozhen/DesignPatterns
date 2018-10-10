package example1;

/**
 * 浅克隆
 * 
 * @author wuzz
 * @date 2018年10月10日 下午2:16:27
 */
public class Client {
	public static void main(String a[]) {
		Email email, copyEmail;

		email = new Email("张三", 12);

		copyEmail = (Email) email.clone();
		
		System.out.println("email==copyEmail?");
		System.out.println(email == copyEmail);
		
		System.out.println(email.hashCode());
		System.out.println(copyEmail.hashCode());
		
		
		System.out.println("email.getAttachment==copyEmail.getAttachment?");
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
		
		
		Attachment emailAttachment = email.getAttachment();
		Attachment copyEmailAttachment = copyEmail.getAttachment();
		System.out.println(emailAttachment.hashCode());
		System.out.println(copyEmailAttachment.hashCode());
		
		copyEmail.setAge(13);
		emailAttachment.download(email);
		copyEmailAttachment.download(copyEmail);
	}
}