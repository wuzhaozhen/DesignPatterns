package example1;

public interface TVIterator {
	void setChannel(int i);

	void next();

	void previous();

	boolean isLast();

	Object currentChannel();

	boolean isFirst();
}