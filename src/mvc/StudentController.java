package mvc;

public class StudentController {
	
	private Student model;
	private StudentView view;
	
	
	
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name){
		this.model.setName(name);
	}
	
	public void setStudentRollNo(String rollNo){
		this.model.setRollNo(rollNo);
	}
	
	public String getStudentName(){
		return model.getName();
	}
	
	public String getStudentRollNo(){
		
		return model.getRollNo();
	}
	

	public void updateView(){
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
