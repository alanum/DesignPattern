package builder;



/**
 *  意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
	主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
    何时使用：一些基本部件不会变，而其组合经常变化的时候。
	如何解决：将变与不变分离开。
	关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
 * @author Karl
 *
 */

public class Do {

	
	public static void main(String[] args){
		
		MealBuilder builder = new MealBuilder();
		
		Meal chickMeal = builder.prepareChickMeal();
		
		chickMeal.showItems();
		
		System.out.println("总价："+chickMeal.getCost());
		
		Meal vegetableMeal = builder.prepareVegetableMeal();
		
		vegetableMeal.showItems();
		
		System.out.println("总价："+vegetableMeal.getCost());
	}
}
