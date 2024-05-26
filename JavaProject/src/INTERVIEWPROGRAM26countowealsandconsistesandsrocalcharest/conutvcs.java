package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Scanner;

public class conutvcs {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	char a[]=name.toCharArray();
	int size=a.length;
	int vowel=0;
	int constant=0;
	int special=0;
	int i=0;
	while(i!=size) {
		if(a[i]>'a'&&a[i]<='z') {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				vowel++;
			}
			else {
				constant++;
			}
		}
		else {
			special++;
		}
		i++;
	}
	System.out.println(a);
	System.out.println("vowels count :"+vowel);
	System.out.println("contantent count :"+constant);
	System.out.println("special characters count :"+special);
}
}
