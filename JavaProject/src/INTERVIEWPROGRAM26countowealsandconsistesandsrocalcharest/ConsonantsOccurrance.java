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
	char ch[]=name.toCharArray();
	Map<Character, Integer> mp = new TreeMap<Character, Integer>();
	for(int i=0; i<name.length(); i++) {
		char c=ch[i];
		if(c>='a'&&c<='z') {
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
				if(mp.containsKey(c)) {
					Integer intt=mp.get(ch[i]);
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
