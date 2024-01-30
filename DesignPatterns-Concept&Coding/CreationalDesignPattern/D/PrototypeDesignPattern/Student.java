package D.PrototypeDesignPattern;

public class Student implements IPrototype {
	
	int rollnumber;
	String name;
	private int age;
	
	Student(int rollnumber,String name,int age){
		this.rollnumber=rollnumber;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public IPrototype cloneOriginalObject() {
		return new Student(rollnumber, name, age);
	}
	
}
