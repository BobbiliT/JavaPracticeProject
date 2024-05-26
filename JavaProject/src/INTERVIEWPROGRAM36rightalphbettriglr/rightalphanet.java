package INTERVIEWPROGRAM36rightalphbettriglr;

import java.util.Scanner;

public class rightalphanet {
	public static void main(String[] args) {
		System.out.println("enter your numebr :");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int a=65;
		for(int i=0; i<=num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
	}

}
