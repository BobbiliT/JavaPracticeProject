package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedListSetProgram {
public static void main(String[] args) {
	LinkedHashSet<String> lls = new LinkedHashSet<String>();
	lls.add("tejesh");
	lls.add("naresh");
	lls.add("kamesh");
	lls.add("rajesh");
	lls.add("haresh");
	lls.add("tejesh");
	System.err.println("print the list :");
	System.out.println(lls);
	System.err.println("iterat and print :");
	Iterator<String> i = lls.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.err.println("add element first in the list :");
	lls.addFirst("bobbili");
	System.out.println(lls);
	System.err.println("add element last in the list :");
	lls.addLast("teju");
	System.out.println(lls);
	System.err.println("check elements present or not in the list :");
	System.out.println(lls.contains("tejesh"));
	System.out.println(lls.contains("bobbili"));
	System.out.println(lls.contains("rajesh"));
}
}
//->linkedhashset class is hashtable and linkedlist implimentation of the set interface.
//->linkedhashset inheritance of hashset and implimentation of set intreface.
//->linkedhashset contains the uniqe elements 
//->linkedhashset class provided all optional set interface and premitive null elements 
//->linkedhashset class is non-synchronized
//->linkedhashset maintain the inseraction order
//->linkedhashset does not allows duplicate elemtns