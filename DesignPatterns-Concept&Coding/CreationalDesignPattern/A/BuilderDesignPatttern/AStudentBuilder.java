package A.BuilderDesignPatttern;

import java.util.List;

public abstract class AStudentBuilder {
	int rollno;
	String name;
	String fathername;
	String mothername;
	int age;
	List<String> subjects;
	
	public AStudentBuilder setRollno(int rollno) {
		this.rollno = rollno;
		return this;
	}
	public AStudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public AStudentBuilder setFathername(String fathername) {
		this.fathername = fathername;
		return this;
	}
	public AStudentBuilder setMothername(String mothername) {
		this.mothername = mothername;
		return this;
	}
	public AStudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	 abstract AStudentBuilder setSubjects();
	 
	 public Student build() {
		 return new Student(this);
	 }
	

}
