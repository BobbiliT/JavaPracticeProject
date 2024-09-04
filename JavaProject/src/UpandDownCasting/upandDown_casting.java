package UpandDownCasting;

class a {
	public void name() {
		System.out.println("tejesh");
	}
}

class b extends a {
	public void intial() {
		System.out.println("bobbili");
	}
}

public class upandDown_casting {
	public static void main(String[] args) {
		
		//this is upcasting
		a object1 = new b();
		object1.name();
		
		//this is downcasting
		b object2 = (b)object1;
		object2.intial();
	}
}
