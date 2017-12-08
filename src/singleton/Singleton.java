package singleton;

public class Singleton {

	
	//饿汉式 这种方式比较常用，但容易产生垃圾对象。
	private static Singleton instance = new Singleton();
	
	//采用双锁机制，安全且在多线程情况下能保持高性能。
//	private volatile static Singleton instance = new Singleton();
	
	
	private Singleton(){}
	
	
	
	public static Singleton getInstance(){
		return instance;
	}
	
	public void showTips(){
		System.out.println("hello,i am a singleton object");
	}
	
	
	/**
	 * 懒汉式，线程不安全
	 * @return
	 */
	public Singleton getInstance2() {
		
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	
	/**
	 * 懒汉式，线程安全 ,因为加锁了，影响效率
	 * @return
	 */
	
	public static synchronized Singleton getInstance3(){
		
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
		
	}
	
	
	//这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
	public static Singleton getInstance4(){
		
		if(instance == null){
			
			synchronized (Singleton.class) {
				
				if(instance == null){
					instance = new Singleton();
				}
			}
			
		}
		
		return instance;
	
	} 
	
	
	
}
