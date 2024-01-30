package A.ProblemStatement;

public class Main {

	public static void main(String[] args) {
		
		Directory movieDirectory=new Directory("Movie");
		File f1=new File("Border");
		movieDirectory.add(f1);
		
		Directory subDirectory=new Directory("ComedyMovie");
		File f2=new File("corner");
		subDirectory.add(f2);
		
		movieDirectory.add(subDirectory);
		movieDirectory.ls();
		
		

	}

}
