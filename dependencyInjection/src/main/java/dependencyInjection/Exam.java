package dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Object injection
		System.out.println("bean.xml loaded");
		Student student=context.getBean("stud",Student.class);
		student.teaching();
		
		StudentTwo studentTwo= context.getBean("student2",StudentTwo.class);
		studentTwo.startTeaching();
		
		
		
		//Student obj=context.getBean("student",Student.class);
		//obj.displayStudentInfo();
		
		//Student obj2=context.getBean("student2",Student.class);
		//obj2.displayStudentInfo();
		
		/*Student Obj1 = (Student) context.getBean("student");
        Obj1.setStudentName("shachi");
        Obj1.displayStudentInfo();
 
        //getBean called second time
        Student Obj2 = (Student) context.getBean("student");
        Obj2.displayStudentInfo();*/
		
        //Student obj = (Student) context.getBean("StudentList");
        //obj.printListOfStudents();
		
	}
}
