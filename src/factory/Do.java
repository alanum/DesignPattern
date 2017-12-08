package factory;


/**
 * 

 * 	意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
	主要解决：主要解决接口选择的问题。
	何时使用：我们明确地计划不同条件下创建不同实例时。
	如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
	关键代码：创建过程在其子类执行。

 * 
 * @author Karl
 *
 */

public class Do {
	
	
		
	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.getShape("CIRCLE");
		Shape shape2 = factory.getShape("RECTANGLE");
		Shape shape3 = factory.getShape("SQUARE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
