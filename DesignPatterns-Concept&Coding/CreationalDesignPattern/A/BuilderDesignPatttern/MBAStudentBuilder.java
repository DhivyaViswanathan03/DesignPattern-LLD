package A.BuilderDesignPatttern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends AStudentBuilder {

	@Override
	public AStudentBuilder setSubjects() {
		List<String> subs=new ArrayList();
		subs.add("MJAVA");
		subs.add("MC");
		subs.add("MDS");
		subs.add("MDP");
		this.subjects=subs;
		return this;
	}

}
