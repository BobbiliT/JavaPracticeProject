package INTERVIEWPROGRAM01swapnumber;

import java.util.Scanner;

public class FourTypesSwaaping {
public static void main(String[] args) {
	System.out.println("enter your numbers :");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	System.err.println("swapping numbers by using 3rd variable :");
	System.out.println("before swapping numbers :" + "a =" + a + " " + "b =" + b);
	int t = a;
	a = b;
	b = t;
	System.out.println("after swapping numbers :" + "a =" + a + " " + "b =" + b);
	System.err.println("swapping numbers by using -and+ :");
	System.out.println("before swapping numbers :" + "a =" + a + " " + "b =" + b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("after swapping numbers :" + "a =" + a + " " + "b =" + b);
	System.err.println("swapping numbers by using *and/ :");
	System.out.println("before swapping numbers :" + "a =" + a + " " + "b =" + b);
	a = a * b;
	b = a / b;
	a = a / b;
	System.out.println("after swapping numbers :" + "a =" + a + " " + "b =" + b);
	System.err.println("swapping numbers by using single statment :");
	System.out.println("before swapping numbers :" + "a =" + a + " " + "b =" + b);
	b = a + b - (a = b);
	System.out.println("after swapping numbers :" + "a =" + a + " " + "b =" + b);

}
}
