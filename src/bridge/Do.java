package bridge;


/**
 * @see <a href="http://design-patterns.readthedocs.io/zh_CN/latest/structural_patterns/bridge.html"></a>
 * 
 * 	桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 	这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
	这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响
	
	模式动机：
	设想如果要绘制矩形、圆形、椭圆、正方形，我们至少需要4个形状类，但是如果绘制的图形需要具有不同的颜色，如红色、绿色、蓝色等，此时至少有如下两种设计方案：
	第一种设计方案是为每一种形状都提供一套各种颜色的版本。
	第二种设计方案是根据实际需要对形状和颜色进行组合
	对于有两个变化维度（即两个变化的原因）的系统，采用方案二来进行设计系统中类的个数更少，且系统扩展更为方便。设计方案二即是桥接模式的应用。
	桥接模式将继承关系转换为关联关系，从而降低了类与类之间的耦合，减少了代码编写量。
	
	桥接模式包含如下角色：

	Abstraction：抽象类 Shape
	RefinedAbstraction：扩充抽象类 Circle
	Implementor：实现类接口 DrawAPI
	ConcreteImplementor：具体实现类 GreenCircle RedCircle
	
	
	理解桥接模式，重点需要理解如何将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化。

	抽象化：抽象化就是忽略一些信息，把不同的实体当作同样的实体对待。在面向对象中，将对象的共同性质抽取出来形成类的过程即为抽象化的过程。
	实现化：针对抽象化给出的具体实现，就是实现化，抽象化与实现化是一对互逆的概念，实现化产生的对象比抽象化更具体，是对抽象化事物的进一步具体化的产物。
	脱耦：脱耦就是将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联，将两个角色之间的继承关系改为关联关系。
	桥接模式中的所谓脱耦，就是指在一个软件系统的抽象化和实现化之间使用关联关系（组合或者聚合关系）而不是继承关系，从而使两者可以相对独立地变化，这就是桥接模式的用意。

	
	
 * @author Karl
 *
 */
public class Do {
	
	public static void main(String[] args){
		//使用 Shape 和 DrawAPI 类画出不同颜色的圆。
		Shape redCircle = new Circle(100, 100, 50, new RedCircle());
		Shape greenCircle = new Circle(100, 10, 25, new GreenCircle());
		
		redCircle.draw();
	
		greenCircle.draw();
	
	}

}
