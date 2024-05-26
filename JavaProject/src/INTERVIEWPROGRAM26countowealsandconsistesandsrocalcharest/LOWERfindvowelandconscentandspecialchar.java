package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Scanner;

public class LOWERfindvowelandconscentandspecialchar {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	char c[]=name.toCharArray();
	int size=c.length;
	int vowel=0;
	int conscent=0;
	int specailchar=0;
	int i=0;
	while(i!=size) {
		if(c[i]>'a'&&c[i]<'z') {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				vowel++;
			}
			else {
				conscent++;
			}
		}
		else {
			specailchar++;
		}
		i++;
	}
	System.out.println(name);
	System.out.println("vowel count :"+vowel);
	System.out.println("conscent count :"+conscent);
	System.out.println("specailchar count :"+specailchar);
}
}
