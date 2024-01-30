package A1.Solution1WithCompositeDesign;

public class File implements IFileSystem {
	String name;

	File(String name) {
		this.name = name;
	}

	@Override
	public void ls() {
		System.out.println("File name is:" + name);
	}

}
