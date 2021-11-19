package dependencyInjection;
import java.util.List;

public class Student {
	private int id;
	private MathTeach mathTeach;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathTeach(MathTeach mathTeach) {
		this.mathTeach = mathTeach;
	}
	public void teaching() {
		mathTeach.mathTeach();
		System.out.println("Student id is "+id);
	}
	
	
	
	/*private String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/


	//setter injection
	/*public void setId(int id) {
		this.id = id;
		System.out.println("setter method called");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("setter method called");
	}
	
	
//constructor injection
	
	/*public Student(int id) {
		this.id=id;
	}
	
	public Student(int id, String studentName) {
		
		this.id = id;
		this.studentName = studentName;
	}
	public void displayStudentInfo() {
		System.out.println("Student name is "+studentName+" and the id is "+id);
	}
	
	*/
	

	/*//initializing collection
	 List listOfStudents;
    public List getListOfStudents() {
		return listOfStudents;
	}
	public void setListOfStudents(List listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	public void printListOfStudents()
    {
        System.out.println("Here is the list of student :");
        for(Object stud:listOfStudents)
        {
            System.out.println(stud);
        }	
}*/
}
