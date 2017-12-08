package business;

//业务代表类

public class BusinessDelegate {

	private BusniessLookup lookupService = new BusniessLookup();
	private BusinessService businessService;
	private String serviceType;
	
	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}
	
	public void doTask(){
		
		businessService = lookupService.getBusinessService(serviceType);
		
		businessService.doProcessing();
	}
}
