package example3;

public class NewCollection implements MyCollection {
	private Object[] obj = { "dog", "pig", "cat", "monkey", "pig" };

	public MyIterator createIterator() {
		return new NewIterator();
	}

	public class NewIterator implements MyIterator {
		private int currentIndex = 0;

		public void first() {
			currentIndex = 0;
		}

		public void next() {
			if (currentIndex < obj.length) {
				currentIndex++;
			}
		}

		public void previous() {
			if (currentIndex > 0) {
				currentIndex--;
			}
		}

		public boolean isLast() {
			return currentIndex == obj.length;
		}

		public boolean isFirst() {
			return currentIndex == 0;
		}

		public Object currentItem() {
			return obj[currentIndex];
		}

	}
}