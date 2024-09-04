package _SpecificInterviewPrograms;

import java.util.Scanner;
 
public class pemdas {     //( PEMDAS = Parentheses Exponents Multiplication Division substraction addition)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter base value = ");
		int base = s.nextInt();
		System.out.println("enter exponent value = ");
		int exponent = s.nextInt();

		int result = 1;
		while (exponent != 0) {
			result = result * base;
			--exponent;
		}
		System.out.println("result " + result);
	}
}
