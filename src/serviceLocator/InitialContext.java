package serviceLocator;

public class InitialContext {

	public Object lookup(String jndiName){
		
		
		if(jndiName.equals("ServiceOne")){
			return new Service1();
		}else if(jndiName.equalsIgnoreCase("ServiceTwo")){
			return new Service2();
		}
		return null;
	}
	
	
}
