package example2;

import java.util.*;

public class IteratorDemo {
	public static void process(Collection<String> c) {
		Iterator<String> i = c.iterator();

		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}

	public static void main(String args[]) {
		Collection<String> list = new HashSet<String>();
		list.add("Cat");
		list.add("Dog");
		list.add("Pig");
		list.add("Dog");
		list.add("Monkey");

		process(list);
	}
}