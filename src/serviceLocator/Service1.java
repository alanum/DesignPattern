package serviceLocator;

public class Service1  implements Service {

	@Override
	public String getName() {
		return "serviceOne";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service1");
	}

}
