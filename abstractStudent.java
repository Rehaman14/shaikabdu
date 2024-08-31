package apr_26;

public abstract  class abstractStudent 
{
	protected String studentName;
	protected String studentClass;
	protected static final int totalNoOfStudents=23;
	
	public abstract int getPercentage();
	
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}
 public abstractStudent() 
 {
	 
 }

public abstractStudent(String studentName, String studentClass) {
	super();
	this.studentName = studentName;
	this.studentClass = studentClass;
}

@Override
public String toString() {
	return "abstractStudent [studentName=" + studentName + ", studentClass=" + studentClass + "]";
}

}
