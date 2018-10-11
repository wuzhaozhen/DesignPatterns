package example3.Component.Leaf;

import example2.Component.AbstractFile;

public class TextFile extends AbstractFile {
	private String name;

	public TextFile(String name) {
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		// 模拟杀毒
		System.out.println("----对文本文件'" + name + "'进行杀毒");
	}
}
