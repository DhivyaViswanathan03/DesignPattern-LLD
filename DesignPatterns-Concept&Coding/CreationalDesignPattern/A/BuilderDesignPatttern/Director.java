package A.BuilderDesignPatttern;

public class Director {
	
	AStudentBuilder builder;
	
	public Director(AStudentBuilder builder) {
		this.builder=builder;
	}
	
	public Student create() {
		if(this.builder instanceof EngineerStudentBuilder) {
			return createEngineerInfo();
		}else if(this.builder instanceof MBAStudentBuilder) {
			return createMBAStudent();
		}
		return null;
	}

	public Student createMBAStudent() {
		return builder.setMothername("Sumathi").setSubjects().build();
	}

	public Student createEngineerInfo() {
		
		return builder.setRollno(10).setFathername("Viswanathan").setSubjects().build();
	}

	
}
