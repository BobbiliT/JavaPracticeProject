package INTERVIEWPROGRAM16findduplicateelements;

import java.util.HashSet;

public class duplicateelemtechanedforloop {
	public static void main(String[] args) {
		HashSet<String> lang = new HashSet<String>();
		String arr[] = { "a", "b", "c", "d", "a" };
		boolean value = false;
		for (String l : arr) {
			if (lang.add(l) == false) {
				System.out.println("duplicate element found :" + l);
				value = true;
			}
		}
		if (value == false) {
			System.out.println("duplicate is not found");
		}
	}

}
