package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name,dept;
	private int salary;
	private List<Employee> subordinates;
	
	
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates
				+ "]";
	}

	public void add(Employee item){
		subordinates.add(item);
	}
	
	public void remove(Employee item){
		subordinates.remove(item);
	}
	
}
