package bridge;


/**
 * 桥接实现类
 * @author Karl
 *
 */

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle color:Red ,raduis: " + radius + " x: "+x +" y :"+ y);
	}

}
