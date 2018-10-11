package example1.Composite.Component;

import java.util.*;

import example1.Composite.MyElement;

public class Plate extends MyElement {
    private ArrayList<MyElement> list = new ArrayList<MyElement>();

    public void add(MyElement element) {
        list.add(element);
    }

    public void delete(MyElement element) {
        list.remove(element);
    }

    public void eat() {
        for (Object object : list) {
            ((MyElement) object).eat();
        }
    }
}