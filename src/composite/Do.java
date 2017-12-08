package composite;

/**
 * 
 * 	把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
	这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
	
	优点： 1、高层模块调用简单。 2、节点自由增加。
	缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。

 * @author Karl
 *
 */

public class Do {

	public static void main(String[] args) {

		Employee ceo = new Employee("karl", "ceo", 500000);

		Employee headSales = new Employee("Robert", "Head Sales ", 200000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		ceo.add(headSales);
		ceo.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		System.out.println(ceo);
		for (Employee headEmployee : ceo.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}

}
