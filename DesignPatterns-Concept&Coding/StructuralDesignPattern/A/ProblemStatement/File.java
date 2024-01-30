package A.ProblemStatement;

public class File {
	
	String name;
	
	File(String name){
		this.name=name;
	}
	
	public void ls() {
		System.out.println("File Name:"+name);
	}

}
