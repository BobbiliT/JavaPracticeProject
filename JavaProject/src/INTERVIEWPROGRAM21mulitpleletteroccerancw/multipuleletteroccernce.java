package INTERVIEWPROGRAM21mulitpleletteroccerancw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class multipuleletteroccernce {
	public static void main(String[] args) {
		System.out.println("enter your name :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll(" ", "");
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			} else {
				hs.put(c, 1);
			}
		}
		System.out.println(hs);
	}
}
