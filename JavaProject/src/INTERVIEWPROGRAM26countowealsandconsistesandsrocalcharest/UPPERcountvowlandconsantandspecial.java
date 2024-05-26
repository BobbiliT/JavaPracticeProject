package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Scanner;

public class UPPERcountvowlandconsantandspecial {
public static void main(String[] args) {
	System.out.println("enter your charcters :");
	Scanner s = new Scanner(System.in);
	String name = s.nextLine();
	char c[]=name.toCharArray();
	int size=c.length;
	int vowel =0;
	int consant=0;
	int specailchar=0;
	int i=0;
	while(i!=size) {
		if(c[i]>='A'&&c[i]<='z') {
			if(c[i]=='a'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				vowel++;
			}
			else {
				consant++;
			}
		}else {
			specailchar++;
		}
		i++;
	}
	System.out.println(name);
	System.out.println("vowel count :"+vowel);
	System.out.println("consant count :"+consant);
	System.out.println("specailchar count :"+specailchar);
}
}
