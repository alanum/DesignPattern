package interceptingFilter;

public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("DebugFilter request: " + request);
	}

}
