package example3.Component;

/**
 * 抽象文件类：抽象构件
 * 
 * @author wuzz
 * @date 2018年10月11日 上午9:27:37
 */
public abstract class AbstractFile {

	public void add(AbstractFile file) {
		System.out.println("对不起，不支持该方法！");
	};

	public void remove(AbstractFile file) {
		System.out.println("对不起，不支持该方法！");
	};

	public AbstractFile getChild(int i) {
		System.out.println("对不起，不支持该方法！");
		return null;
	};

	public abstract void killVirus();
}