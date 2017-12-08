package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> mememtoList = new ArrayList<>();
	
	
	public void add(Memento memento){
		this.mememtoList.add(memento);
	}
	
	public Memento get(int index){
		return mememtoList.get(index);
	}
}
