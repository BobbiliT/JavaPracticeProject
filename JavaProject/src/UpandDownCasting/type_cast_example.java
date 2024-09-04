package UpandDownCasting;

public class type_cast_example {
	public static void main(String[] args) {
		double d = 10.7;
		//int i=d; cannot convert double to int 
		int i = (int) d; // here do this we might date miss 
		System.out.println(i);
	}
}
