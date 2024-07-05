package kiraninterview;

public class staticandnonstatic {

	static {
		System.out.println("static keyword.");
	}
	public void math() {
		System.out.println("non-static keyword.");
	}
public static void main(String[] args) {
	System.out.println("main method");
	staticandnonstatic s= new staticandnonstatic();
	s.math();
}
}
