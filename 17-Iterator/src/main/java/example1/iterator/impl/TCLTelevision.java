package example1.iterator.impl;

import example1.iterator.TVIterator;
import example1.iterator.Television;

public class TCLTelevision implements Television {

	@Override
	public TVIterator createIterator() {
		return new TCLIterator();
	}
}