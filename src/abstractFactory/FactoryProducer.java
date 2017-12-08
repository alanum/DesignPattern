package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if ("SHAPE".equals(choice)) {
			return new ShapeFactory();
		} else if ("COLOR".equals(choice)) {
			return new ColorFactory();
		}

		return null;

	}

}
