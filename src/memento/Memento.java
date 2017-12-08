package memento;

public class Memento {
	
	public Memento(String state) {
		super();
		this.state = state;
	}

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
