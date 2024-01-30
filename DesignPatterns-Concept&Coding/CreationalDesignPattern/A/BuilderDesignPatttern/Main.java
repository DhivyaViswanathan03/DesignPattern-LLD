package A.BuilderDesignPatttern;

public class Main {

	public static void main(String[] args) {
		
		Director director1=new  Director(new EngineerStudentBuilder());
		Director director2=new  Director(new MBAStudentBuilder());
		System.out.println(director1.create());
		System.out.println(director2.create());

	}

}
