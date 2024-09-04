package ExceptionHandling;

public class unreachiable_error {
	public static void main(String[] args) {
		int i=20;
		int j=0;
		try {
			int c=i%j;
		}
			catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		//catch(ArithmeticException ae) {       // unreachbule catch block
			
		//}
	}
}
