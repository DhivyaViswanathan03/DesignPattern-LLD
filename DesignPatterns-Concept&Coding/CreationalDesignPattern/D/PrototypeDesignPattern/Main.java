package D.PrototypeDesignPattern;

public class Main {
	
	public static void main(String args[]) {
		Student student=new Student(101, "divs", 30);
		IPrototype cloneObj = student.cloneOriginalObject();
		System.out.println(cloneObj);
	}

}
