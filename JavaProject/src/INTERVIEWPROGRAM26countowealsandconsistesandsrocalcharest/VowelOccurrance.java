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
	char ch[]=name.toCharArray();
	Map<Character, Integer> mp = new TreeMap<Character, Integer>();
	for(int i=0; i<name.length(); i++) {
		char c=ch[i];
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			if(mp.containsKey(c)) {
				Integer inte=mp.get(ch[i]);
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
