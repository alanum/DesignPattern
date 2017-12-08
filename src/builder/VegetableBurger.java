package builder;

public class VegetableBurger extends Burger{

	@Override
	public String name() {
		return "VegetableBurger";
	}

	@Override
	public Float price() {
		return 1.25f;
	}

}
