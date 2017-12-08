package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
	
		return null;
	}

	@Override
	Color getColor(String color) {

		if ("RED".equals(color)) {
			return new Red();
		} else if ("GREEN".equals(color)) {
			return new Green();
		} else if ("BLUE".equals(color)) {
			return new Blue();
		}

		return null;
	}
}
