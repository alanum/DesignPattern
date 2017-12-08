package proxy;


/**
 * 	代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
	在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * @author Karl
 *
 */
public class Do {

	public static void main(String[] args){
		
		Image proxy = new ProxyImage("thumb_01.jpg");
		
		proxy.display();
		
		proxy.display();
	}
}
