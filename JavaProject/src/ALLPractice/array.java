package ALLPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("tejesh");
		al.add("kamesh");
		al.add("naresh");
		al.add("suresh");
		System.out.println(al);
		Object[] array = al.toArray();
		System.out.println(array.toString());
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
