package A.BuilderDesignPatttern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends AStudentBuilder {

	@Override
	AStudentBuilder setSubjects() {
		List<String> subs=new ArrayList();
		subs.add("JAVA");
		subs.add("C");
		subs.add("DS");
		subs.add("DP");
		this.subjects=subs;
		return this;
	}

}
