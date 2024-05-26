package iterator;

import java.util.*;

public class listiterator {
public static void main(String[] args) {
	ArrayList<String> as = new ArrayList();
	as.add("tejesh");
	as.add("ramu");
	as.add("ravi");
	ListIterator<String> l=as.listIterator();
	while(l.hasNext()) {
		System.out.println(l.next());
	}
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}
}
}
