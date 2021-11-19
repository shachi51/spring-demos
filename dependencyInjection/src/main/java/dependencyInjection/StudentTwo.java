package dependencyInjection;

public class StudentTwo {
	private MathTeach teach;

	public void setTeach(MathTeach teach) {
		this.teach = teach;
	}
	public void startTeaching() {
		teach.mathTeach();
	}
	
	
}
