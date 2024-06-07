package Interface;

public class SubInterfaceclass implements CreatInterface{

	public void math1() {
		System.out.println("this is math 1");
		
	}

	public void math2() {
		System.out.println("this is math 2");
		
	}

	public void math3() {
	    System.out.println("this is math 3");
		
	}

	public static void main(String[] args) {
		SubInterfaceclass si = new SubInterfaceclass();
		si.math1();
		si.math2();
		si.math3();
	}
}
