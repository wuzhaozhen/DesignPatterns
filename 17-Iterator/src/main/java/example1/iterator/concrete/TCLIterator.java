package example1.iterator.concrete;

import example1.iterator.TVIterator;

/**
 * 具体迭代器
 * 
 * @author wuzz
 * @date 2018年10月9日 下午4:16:37
 */
public class TCLIterator implements TVIterator {
	private Object[] obj;
	private int currentIndex = 0;

	public TCLIterator(Object[] obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void next() {
		if (currentIndex < obj.length) {
			currentIndex++;
		}
	}

	@Override
	public void previous() {
		if (currentIndex > 0) {
			currentIndex--;
		}
	}

	@Override
	public void setChannel(int i) {
		currentIndex = i;
	}

	@Override
	public Object currentChannel() {
		return obj[currentIndex];
	}

	@Override
	public boolean isLast() {
		return currentIndex == obj.length;
	}

	@Override
	public boolean isFirst() {
		return currentIndex == 0;
	}
}
