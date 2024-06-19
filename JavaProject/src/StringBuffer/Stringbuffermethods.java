package StringBuffer;

import java.util.Scanner;

public class Stringbuffermethods {
public static void main(String[] args) {
	System.out.println("enter your input :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	StringBuffer sb = new StringBuffer(name);
	System.err.println("this is appaned method :");
	System.out.println(sb.append("bobbili"));
	System.err.println("this is insert method :");
	System.out.println(sb.insert(0, "b."));
	System.err.println("this is replace method :");
	System.out.println(sb.replace(2, 3, "teju"));
	System.err.println("this is delet method :");
	System.out.println(sb.delete(1, 5));
	System.err.println("this is capacity method :");
	System.out.println(sb.append("my name"));
	System.out.println(sb.capacity());
	sb.append("my name is tejesh");
	System.out.println(sb.capacity());
	System.err.println("this is reverse method :");
	sb.reverse();
	System.out.println("reverse name is :"+sb);
}
}
//String buffer is synchronized it is a thread safe. it means two thread cannot call the method of string buffer simultionusely.
//String buffer is less then efficent of string bulider.
//it was introduced by jdk 1.0