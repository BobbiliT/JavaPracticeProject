package INTERVIEWPROGRAM21mulitpleletteroccerancw;

import java.util.Scanner;

public class Without_HashMap {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String complet = "";
		for (int i = 0; i < name.length(); i++) {
			int count = 0;
			for (int j = i; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			String ss = String.valueOf(name.charAt(i));
			if(!complet.contains(ss)) {
				complet=complet+name.charAt(i);
				System.out.print(name.charAt(i) + "=" + count+" ");
			}
		}
	}
}
