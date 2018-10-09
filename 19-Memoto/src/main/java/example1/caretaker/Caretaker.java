package example1.caretaker;

import example1.memento.Memento;

/**
 * 它负责保存备忘录，但是不能对备忘录的内容进行操作或检查。
 * 在负责人类中可以存储一个或多个备忘录对象，它只负责存储对象，而不能修改对象，也无须知道对象的实现细节
 * 
 * @Author wuzz
 * @Date 2018年10月8日 下午10:12:53
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}