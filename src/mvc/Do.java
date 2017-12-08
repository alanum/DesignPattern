package mvc;

public class Do {
	
	public static void main(String[] args){
		
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		
		controller.setStudentName("Lee");
		
		controller.updateView();
	}
	
	
	private static Student retriveStudentFromDatabase(){
		
		return new Student("No.1","Karl");
	}
}
