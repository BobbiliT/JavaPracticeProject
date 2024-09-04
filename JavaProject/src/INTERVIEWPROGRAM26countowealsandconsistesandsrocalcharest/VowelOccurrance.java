package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VowelOccurrance {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	name=name.replace(" ", "");
	Map<Character, Integer> mp = new TreeMap<Character, Integer>();
	for(char ch:name.toCharArray()) {
		char c=ch;
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			if(mp.containsKey(c)) {
				Integer inte=mp.get(ch);
				mp.put(c, inte+1);
			}
			else {
				mp.put(c, 1);
			}
		}
	}
	System.out.println(mp);
}
}
