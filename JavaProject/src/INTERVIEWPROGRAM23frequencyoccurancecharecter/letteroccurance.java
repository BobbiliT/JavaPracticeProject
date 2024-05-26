package INTERVIEWPROGRAM23frequencyoccurancecharecter;

import java.util.Scanner;

public class letteroccurance {
public static void main(String[] args) {
	System.out.println("enter your letters :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	name=name.replace(" ", "");
	char ch=s.next().charAt(0);
	int freqancy=0;
	for(int i=0; i<name.length(); i++) {
		if(ch==name.charAt(i))
		freqancy++;
	}
	System.out.println(freqancy);
}
}

