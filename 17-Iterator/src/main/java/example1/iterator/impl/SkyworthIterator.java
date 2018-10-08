package example1.iterator.impl;

import example1.iterator.TVIterator;

public class SkyworthIterator implements TVIterator {
	private Object[] obj = { "CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4", "CCTV-5", "CCTV-6", "CCTV-7", "CCTV-8" };
	private int currentIndex = 0;

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
