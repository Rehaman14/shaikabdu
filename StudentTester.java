package apr_26;

public class StudentTester {

	public static void main(String[] args) {
		abstractStudent a=null;
		a= new ScienceStudent(45, 60, 90);
		System.out.println(a.getPercentage());
		System.out.println(a);
		a=new HistoryStudent(42, 80);
		System.out.println(a.getPercentage());
		System.out.println(a);
	
	}

}
