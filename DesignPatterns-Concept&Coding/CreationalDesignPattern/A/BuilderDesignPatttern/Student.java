package A.BuilderDesignPatttern;

import java.util.List;

public class Student {
	
	int rollno;
	String name;
	String fathername;
	String mothername;
	int age;
	List<String> subjects;
	
	Student(AStudentBuilder builder){
		this.rollno=builder.rollno;
		this.name=builder.name;
		this.fathername=builder.fathername;
		this.mothername=builder.mothername;
		this.age=builder.age;
		this.subjects=builder.subjects;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fathername=" + fathername + ", mothername="
				+ mothername + ", age=" + age + ", subjects=" + subjects + "]";
	}
	
	

}
