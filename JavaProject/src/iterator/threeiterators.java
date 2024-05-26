package iterator;

import java.util.*;

public class threeiterators {
public static void main(String[] args) {
	ArrayList<String> as = new ArrayList();
	as.add("tejesh");
	as.add("virat");
	as.add("kohli");
	System.err.println("this is iterator :");
	Iterator<String>i=as.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	Vector<String> v = new Vector();
	v.add("a");
	v.add("b");
	v.add("c");
	System.err.println("this is enumeration iterator :");
	Enumeration<String> e = v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	ArrayList<String> a = new ArrayList();
	a.add("india");
	a.add("srilanka");
	a.add("pakistan");
	System.err.println("this is listiterator :");
	ListIterator<String>l=a.listIterator();
	System.out.println("forword direction :");
	while(l.hasNext()) {
		System.out.println(l.next());
	}
	System.out.println("backword direction :");
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}	
}
}
