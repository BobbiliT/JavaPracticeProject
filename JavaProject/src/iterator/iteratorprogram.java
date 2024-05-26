package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorprogram {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	Iterator<Integer> i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		i.remove();
	}
	System.out.println(a);
}
}
