package UpandDownCasting;

class student {
	int a = 10;

	public void A() {
		System.out.println("A method");
	}
}

class teacher extends student {
	int b = 20;

	public void B() {
		System.out.println("B method");
	}
}

public class downcasting {
	public static void main(String[] args) {
		teacher t = (teacher)new student();
		t.B();
		System.out.println(t.b);
	}
}
