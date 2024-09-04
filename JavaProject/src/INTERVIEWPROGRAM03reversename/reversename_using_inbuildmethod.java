package INTERVIEWPROGRAM03reversename;

import java.util.Scanner;

public class reversename_using_inbuildmethod {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	StringBuilder st = new StringBuilder();
	st.append(name);
	st.reverse();
	System.out.println("reverse name is :"+st);
}
}
