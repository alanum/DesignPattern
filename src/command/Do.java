package command;


/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * @author Karl
 *
 */
public class Do {

	public static void main(String[] args){
		
		Stock stock = new Stock();
		
		BuyStock buyStock = new BuyStock(stock);
		
		SellStock sellStock = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		
		broker.placeOrders();
	}
}
