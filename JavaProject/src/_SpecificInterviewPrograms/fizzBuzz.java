package _SpecificInterviewPrograms;

import java.util.Scanner;

public class fizzBuzz {
	public static void main(String[] args) {
		System.out.println("enter your number :");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1; i<=num; i++) { // 1 2 fizz 4 buzz fizz 7 8 fizz buzz.
			if(i%3==0&&i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
