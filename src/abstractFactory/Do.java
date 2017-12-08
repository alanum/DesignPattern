package abstractFactory;


/**
 * 
 * 	意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
	主要解决：主要解决接口选择的问题。
	何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
	如何解决：在一个产品族里面，定义多个产品。
	关键代码：在一个工厂里聚合多个同类产品
 * 
 * @author Karl
 *
 */

public class Do {
	
	
		
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		Shape shape2 = shapeFactory.getShape("SQUARE");
		Shape shape3 = shapeFactory.getShape("RECTANGLE");
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color color1 = colorFactory.getColor("RED");
		Color color2 = colorFactory.getColor("BLUE");
		Color color3 = colorFactory.getColor("GREEN");
		
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
		color1.fill();
		color2.fill();
		color3.fill();
	}

}
