package UpandDownCasting;

class parent{
	int a=10;
	public void A(){
		System.out.println("A mehtod.");
	}
}
class child extends parent{
	int b=20;
	public void A() {
		System.out.println("B method.");
	}
}
public class upcasting {
public static void main(String[] args) {
	parent p = new child();
	p.A();
}
}
