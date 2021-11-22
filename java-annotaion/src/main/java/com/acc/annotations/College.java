package com.acc.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Component("collegeBean")
public class College {
	
	@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principal;

	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using set principal");
	}
	

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("testing this method");
		//System.out.println("My college name is "+collegeName);
	}

	/*public College(Principal principal) {
		this.principal = principal;
	}*/
	
	/*public College(Principal principalBean) {
	this.principal=principal;
}*/

}
