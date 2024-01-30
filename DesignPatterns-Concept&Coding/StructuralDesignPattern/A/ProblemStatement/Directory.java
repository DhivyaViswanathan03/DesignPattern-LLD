package A.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	String directoryName;
	List<Object> objectLists;

	Directory(String dirName) {
		this.directoryName = directoryName;
		objectLists = new ArrayList();

	}
	
	public void add(Object obj) {
		objectLists.add(obj);
	}

	public void ls() {
		System.out.println("Directory.ls()");
		System.out.println("Initial Obj list is:"+objectLists); 
		for (Object obj : objectLists) {
			System.out.println("Obj list is:"+objectLists);
			System.out.println("Obj is:"+obj);
			if (obj instanceof File) {
				((File) obj).ls();
			} else if (obj instanceof Directory) {
				((Directory) obj).ls();
			}
			System.out.println("After for loop Obj list is"+objectLists);
		}
	}

}
