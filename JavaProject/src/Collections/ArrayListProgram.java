package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProgram {
public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<String>();
	ar.add("tejesh");
	ar.add("kamesh");
	ar.add("naresh");
	ar.add("suresh");
	ar.add("haresh");
	ar.add("ramesh");
	System.err.println("print array type in this list :");
	System.out.println(ar);
	System.err.println("print one by one word :");
	for(String s:ar) {
		System.out.println(s);
	}
	System.err.println("short the array List :");
	Collections.sort(ar);
	System.out.println(ar);
	System.err.println("get the size of the list :");
	System.out.println(ar.size());
	System.err.println("reterving the element from the list :");
	System.out.println(ar.get(2));
	System.err.println("update the element from the list :");
	ar.set(2, "bobbili");
	System.out.println(ar);
	System.err.println("get the first element from the list :");
	System.out.println(ar.getFirst());
	System.err.println("get the last element from the list :");
	System.out.println(ar.getLast());
	System.err.println("remove element from the list :");
	ar.remove(2);
	System.out.println(ar);
	System.err.println("verifcation name form the list :");
	System.out.println(ar);
	System.out.println(ar.contains("tejesh"));
	System.out.println(ar.contains("haresh"));
	System.err.println("another way to adding the element from the list :");
	ar.add(2, "viart");
	System.out.println(ar);
	System.err.println("print the words by using iterator :");
	Iterator<String> i = ar.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
//-> Array list use the dynamic array for storing the elements. it is like an array, but there is no size. we can add and remove
//data at any time, 
//-> it's much more flexiable then the treaditional array
//->it founded by java.until.pakage
//->arraylist contains duplicate elements
//->arraylist maintains inserction order
//->arraylist is non-synchronized
//->arraylist manipulation littel bit slower then the linkedlist,if any element remove form the list lot of shifting opertion will be invelved
//->we cannot creat an array list of the premitive data type if its required the we can use required warrper classes



