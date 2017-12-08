package flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Circle getCircle(String color) {

		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Create circle of color ");
		}

		return circle;

	}
}
