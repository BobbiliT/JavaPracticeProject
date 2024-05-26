package iterator;

import java.util.*;

public class enumerateprogram {
public static void main(String[] args) {
	Vector<String> as = new Vector();
	as.add("a");
	as.add("b");
	as.add("c");
	as.add("d");
	Enumeration<String> e =as.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
