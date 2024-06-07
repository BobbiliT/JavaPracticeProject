package anonymousobject;

public class b extends a{

	public void b1() {
		System.out.println("b1");
	}
	public void b2() {
		System.out.println("b2");
	}
	public static void main(String[] args) {
		a aa = new b();
		aa.a1();
		aa.a2();
		aa.a3();
	}
}
