package example3;

/**
 * 懒汉模式
 * 
 * @author wuzz
 * @date 2018年9月29日 下午5:15:25
 */
public class Singleton {
	// 创建类的唯一实例
	private static Singleton instance = null;

	// 构造方法私有化
	private Singleton() {
	}

	// 提供获取实例的公用方法
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}