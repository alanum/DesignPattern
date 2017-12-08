package builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public Float price() {
		return 60f;
	}

}
