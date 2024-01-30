package A1.Solution1WithCompositeDesign;

public class Main {

	public static void main(String[] args) {
		
		Directory movieDirectory=new Directory("Movie");
		IFileSystem f1=new File("Border");
		movieDirectory.add(f1);
		
		Directory subDirectory=new Directory("ComedyMovie");
		IFileSystem f2=new File("corner");
		subDirectory.add(f2);
		
		movieDirectory.add(subDirectory);
		movieDirectory.ls();
		
		

	}

}
