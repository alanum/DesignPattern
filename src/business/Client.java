package business;

public class Client {
	
	BusinessDelegate delegate;
	
	public Client(BusinessDelegate delegate) {
		this.delegate = delegate;
	}
	
	public void doTask(){
		this.delegate.doTask();
	}
}
