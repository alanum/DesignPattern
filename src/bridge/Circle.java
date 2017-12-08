package bridge;

public class Circle  extends Shape{

	private int x,y,radius;
	
	public Circle(int x,int y,int raduis,DrawAPI api) {
		super(api);
		this.x = x;
		this.y = y;
		this.radius = raduis;
	}
	
	
	@Override
	public void draw() {
		api.drawCircle(radius, x, y);
	}

}
