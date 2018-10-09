package example1.iterator;

/**
 * 抽象迭代器
 * 
 * @author wuzz
 * @date 2018年10月9日 下午4:15:54
 */
public interface TVIterator {
	void setChannel(int i);

	void next();

	void previous();

	boolean isLast();

	Object currentChannel();

	boolean isFirst();
}