package INTERVIEWPROGRAM34squarholepattern;

import java.util.Scanner;

public class squareholepattern {
	public static void main(String[] args) {
		System.out.println("enter your numebr :");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i==0||j==0||i==num-1||j==num-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
