package INTERVIEWPROGRAM28panagramornot;

import java.util.Scanner;

public class smallletterspanagramornot {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String x=s.nextLine();
	x=x.replaceAll(" ", "");
	char y[]=x.toCharArray();
	int size = y.length;
	int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int i=0;
	while(i!=size) {
		int index=y[i]-97;
		a[index]=1;
		i++;
	}
	i=0;
	while(i!=26) {
		if(a[i]==1) {
			i++;
		}
		else {
			System.out.println("string is not panagram.");
			System.exit(0);
		}
	}
	System.out.println("string is panagram.");
}
}
