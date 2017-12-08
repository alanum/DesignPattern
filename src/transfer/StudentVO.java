package transfer;

//传输对象

public class StudentVO {

	private String name;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public StudentVO(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}


	
	
	
	

}
