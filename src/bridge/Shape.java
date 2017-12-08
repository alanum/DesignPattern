package bridge;


/**
 * 使用 DrawAPI 接口创建抽象类 Shape
 * @author Karl
 *
 */
public abstract class Shape {

	protected DrawAPI api;
	protected Shape(DrawAPI api){
		
		this.api = api;
	}
	
	public abstract void draw();
	
}
