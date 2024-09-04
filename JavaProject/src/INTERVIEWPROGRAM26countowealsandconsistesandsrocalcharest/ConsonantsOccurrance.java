package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ConsonantsOccurrance {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	Map<Character, Integer> mp = new TreeMap<Character, Integer>();
	for(char ch:name.toCharArray()) {
		char c=ch;
		if(c>='a'&&c<='z') {
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
				if(mp.containsKey(c)) {
					Integer intt=mp.get(c);
					mp.put(c, intt+1);
				}
				else {
					mp.put(c, 1);
				}
			}
		}
	}
	System.out.println(mp);
}
}
