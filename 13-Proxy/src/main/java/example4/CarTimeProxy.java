package example4;

public class CarTimeProxy implements Move {
	private Move move;

	public CarTimeProxy(Move move) {
		super();
		this.move = move;
	}

	@Override
	public void run() {
		System.out.println("开始时间打印");
		move.run();
		System.out.println("结束时间打印");
	}

}
