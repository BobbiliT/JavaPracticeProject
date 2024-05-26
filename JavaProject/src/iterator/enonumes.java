package iterator;

import java.util.Enumeration;
import java.util.Vector;

public class enonumes {
public static void main(String[] args) {
	Vector<String> vs = new Vector<String>();
	vs.add("tejesh");
	vs.add("ramu");
	vs.add("pavan");
	vs.add("ravi");
	Enumeration<String> e = vs.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
