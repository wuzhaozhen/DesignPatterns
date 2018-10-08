package example1.command.impl.receiver;

/**
 * 命令的实际执行者
 * 
 * @author wuzz
 * @date 2018年10月8日 下午4:28:12
 */
public class Television {
	public void open() {
		System.out.println("打开电视机！");
	}

	public void close() {
		System.out.println("关闭电视机！");
	}

	public void changeChannel() {
		System.out.println("切换电视频道！");
	}
}