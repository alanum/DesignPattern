package facade;


/**
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 * @author Karl
 *
 */
public class Do {
	public static void main(String[] args){
		
		//使用该外观类画出各种类型的形状。
		
		ShapeMaker maker = new ShapeMaker();
		
		maker.drawCircle();
		
		maker.drawRectangle();
		
		maker.drawSquare();
	}
}
