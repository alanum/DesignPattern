package serviceLocator;

import java.util.ArrayList;
import java.util.List;


//缓存 Cache。
public class Cache {
	
	private List<Service> services;
	
	public Cache() {
		services = new ArrayList<>();
	}
	
	public Service getService(String name){
		
		
		for(Service service : services){
			
			if(service.getName().equalsIgnoreCase(name)){
				 System.out.println("Returning cached  "+name+" object");
				return service;
			}
		}
		
		return null;
	}
	
	
	public void addService(Service service){
		
		boolean exists = false;
		
		for(Service item:services){
			if(item.getName().equals(service.getName())){
				exists = true;
			}
		}
		
		if(!exists)
		
		services.add(service);
		
		
		
	}
	
	
	
}
