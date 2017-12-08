package builder;

public class MealBuilder {
	
	
	public Meal prepareVegetableMeal(){
		
		Meal meal = new Meal();
		meal.addItem(new VegetableBurger());
		meal.addItem(new Coke());
		return meal;
	}

	
	public Meal prepareChickMeal(){
		
		Meal meal = new Meal();
		
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
		
	}
}
