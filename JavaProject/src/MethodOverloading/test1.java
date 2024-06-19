package MethodOverloading;

class adding{
	int add(int i, int j) {
		return i+j;
	}
	int add(int i, int j, int k) {
		return i*j*k;
	}
}
public class test1 {
public static void main(String[] args) {
	adding a = new adding();
	System.out.println(a.add(10, 20));
	System.out.println(a.add(10, 20, 30));
}
}
