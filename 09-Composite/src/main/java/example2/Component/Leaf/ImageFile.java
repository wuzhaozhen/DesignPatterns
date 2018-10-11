package example2.Component.Leaf;

import example2.Component.AbstractFile;

/**
 * 图像文件类：叶子构件
 * 
 * @author wuzz
 * @date 2018年10月11日 上午9:28:40
 */
public class ImageFile extends AbstractFile {
	private String name;

	public ImageFile(String name) {
		this.name = name;
	}

	public void add(AbstractFile file) {
		System.out.println("对不起，不支持该方法！");
	}

	public void remove(AbstractFile file) {
		System.out.println("对不起，不支持该方法！");
	}

	public AbstractFile getChild(int i) {
		System.out.println("对不起，不支持该方法！");
		return null;
	}

	public void killVirus() {
		// 模拟杀毒
		System.out.println("----对图像文件'" + name + "'进行杀毒");
	}
}
