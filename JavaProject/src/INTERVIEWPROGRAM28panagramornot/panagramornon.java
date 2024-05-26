package INTERVIEWPROGRAM28panagramornot;

import java.util.Scanner;

public class panagramornon {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s= new Scanner(System.in);
	String name=s.nextLine();
	name=name.replace(" ", "");
	char c[]=name.toCharArray();
	int size=c.length;
	int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int i=0;
	while(i!=size) {
		int index=c[i]-97;
		a[index]=1;
		i++;
	}
	i=0;
	while(i!=26) {
		if(a[i]==1) {
			i++;
		}
		else {
			System.out.println("name is not panagram.");
			System.exit(0);
		}
	}
	System.out.println("name is panagram.");
}
}
