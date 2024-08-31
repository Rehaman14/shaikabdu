package apr_26;

public class ScienceStudent extends abstractStudent 
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	
	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		super("satish","java");
		System.out.println(super.toString());
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}


	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + "]";
	}


	@Override
	public int  getPercentage() {
		return (physicsMarks+chemistryMarks+ mathsMarks)/3;
	}

}
