package INTERVIEWPROGRAM01swapnumber;

import java.util.Scanner;

public class SwapnumberWithout3rdvariables {
	public static void main(String[] args) {
		System.out.println("enter your number :");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Before swapping number " + "a =" + a + "b =" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Before swapping number " + "a =" + a + "b =" + b);
	}
}
