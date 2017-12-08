package transfer;

import java.util.ArrayList;
import java.util.List;

//业务对象

public class StudentBO {

	//列表当作是数据库
	List<StudentVO> students;
	
	public StudentBO(){
		
		
		students = new ArrayList<>();
		
		StudentVO student1 = new StudentVO("Karl", 0);
		StudentVO student2 = new StudentVO("KIKAKO", 1);
		students.add(student1);
		students.add(student2);
	}
	
	public void deleteStudent(StudentVO student){
		this.students.remove(student.getRollNo());
		 System.out.println("Student: Roll No " 
			      + student.getRollNo() +", deleted from database");
		
	}
	
	
	public List<StudentVO> getAllStudents(){
		return students;
	}
	
	public StudentVO getStudent(int index){
		return students.get(index);
	}
	
	public void updateStudent(StudentVO student){
		 students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " 
	      + student.getRollNo() +", updated in the database");
		
	}
	
}
