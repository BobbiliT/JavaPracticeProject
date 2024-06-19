package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgarm {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("a");
	hs.add("b");
	hs.add("c");
	hs.add("d");
	System.err.println("print the list :");
	System.out.println(hs);
	System.err.println("size of the list :");
	System.out.println(hs.size());
	System.err.println("hashcode of the list ");
	System.out.println(hs.hashCode());
	System.err.println("iterate and print the list :");
	Iterator<String> i = hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
//->hashset class is used to creat the collection. that use the hashtable for storage.
//->is inheritance the abstract class and implement the set interface
//->hashset store the element by using mechanisim is hashing
//->hashset contain the unique elements 
//->hashset allow the null values 
//->hashset is non synchorinize
//->hashset does not maintain inseraction order. Here element are stroring by  their hashcode
//->hashset is a good approch of searching operation
//->the initial and default capacity is 16, the load factor is 0.75