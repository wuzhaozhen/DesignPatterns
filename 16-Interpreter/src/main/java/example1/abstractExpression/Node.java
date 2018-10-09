package example1.abstractExpression;

/**
 * （抽象表达式）：在抽象表达式中声明了抽象的解释操作，它是所有终结符表达式和非终结符表达式的公共父类。
 * 
 * @author wuzz
 * @date 2018年10月9日 下午4:31:59
 */
public interface Node {
	public int interpret();
}