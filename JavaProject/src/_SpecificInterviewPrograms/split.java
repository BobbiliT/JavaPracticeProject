package _SpecificInterviewPrograms;

import java.util.Scanner;

public class split {
public static void main(String[] args) {
//	System.out.println("enter your name :");
//	Scanner s = new Scanner(System.in);
	String name = "my name is tejesh";
	String[] st = name.split(";");
	for(String w:st) {
		System.out.println(w);
	}
}
}
