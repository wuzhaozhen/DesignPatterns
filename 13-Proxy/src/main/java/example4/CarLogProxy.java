package example4;

public class CarLogProxy implements Move {
	private Move move;

	public CarLogProxy(Move move) {
		super();
		this.move = move;
	}

	@Override
	public void run() {
		System.out.println("开始日志打印");
		move.run();
		System.out.println("结束日志打印");
	}

}
