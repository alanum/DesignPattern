package interpreter;


/**
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。

 * @author Karl
 *
 */
public class Do {
	public static void main(String[] args){
		
		Expression isMale = getMaleExpression();
		
		Expression isMarried = getMarriedWomenExpression();
		
		
		 System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " 
	      + isMarried.interpret("Married Julie"));
		
	}
	
	
	//规则：Robert 和 John 是男性
	public static Expression getMaleExpression(){
		
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
		
	}
	
	private static Expression getMarriedWomenExpression(){
		
		
		Expression juile = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		
		return new AndExpression(juile, married);
	}
}
