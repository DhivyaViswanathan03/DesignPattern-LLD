package A1.Solution1WithCompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem {
	
	String dirName;
	List<IFileSystem> fileSystemList;
	
	Directory(String dirName){
		this.dirName=dirName;
		this.fileSystemList=new ArrayList<IFileSystem>();
	}
	
	public void add(IFileSystem obj) {
		this.fileSystemList.add(obj);
	}

	@Override
	public void ls() {
		for (IFileSystem obj : fileSystemList) {
			obj.ls();
		}
	}

}
