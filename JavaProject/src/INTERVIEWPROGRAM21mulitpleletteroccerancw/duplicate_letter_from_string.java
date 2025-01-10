package INTERVIEWPROGRAM21mulitpleletteroccerancw;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class duplicate_letter_from_string {
	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name =s.nextLine();
		name=name.replace(" ", "");
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for(Character ch :name.toCharArray()) {
			if(hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch)+1);
			}
			else {
				hs.put(ch, 1);
			}
		}
		Set<Character> set = hs.keySet();
		for(Character ch:set) {
			if(hs.get(ch)>1) {
				System.out.println(ch+"="+hs.get(ch));
			}
		}
	}
}
