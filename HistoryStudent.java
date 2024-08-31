package apr_26;

public class HistoryStudent extends abstractStudent 
{
	 private int istoryMarks;
	 private int civicsMarks;
	
	public HistoryStudent(int istoryMarks, int civicsMarks) {
		super();
		this.istoryMarks = istoryMarks;
		this.civicsMarks = civicsMarks;
	} 
	@Override
	public int getPercentage() {
		return (istoryMarks+civicsMarks)/2;
	}
	@Override
	public String toString() {
		return "HistoryStudent [istoryMarks=" + istoryMarks + ", civicsMarks=" + civicsMarks + "]";
	}
	
	
	 
}
