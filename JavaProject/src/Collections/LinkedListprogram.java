package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListprogram {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("virat");
	ll.add("rohit");
	ll.add("gill");
	ll.add("surya");
	ll.add("pant");
	ll.add("jadu");
	System.err.println("print the list :");
	System.out.println(ll);
	System.err.println("size of the list :");
	System.out.println(ll.size());
	System.err.println("retervail elements from the list :");
	System.out.println(ll.get(3));
	System.err.println("adding some more elements from the list :");
	LinkedList<String> lll = new LinkedList<String>();
	lll.add("bhumra");
	lll.add("siraj");
	lll.add("arshadeep");
	ll.addAll(lll);
	System.out.println(ll);
	System.err.println("check wether the element present or not in the list :");
	System.out.println(ll.contains("virat"));
	System.out.println(ll.contains("rohit"));
	System.err.println("sort the elements from the list :");
	Collections.sort(ll);
	System.out.println(ll);
	System.err.println("reterive and remove the first element into the list :");
	System.out.println(ll.poll());
	System.out.println(ll);
	System.err.println("check wether stack is emply or not :");
	System.out.println(ll.isEmpty());
}
}
//->linkedlist is the one of the implimentaion of list inteface, it presented by jdk 1.2
//->linkedlist store the data in form of noods, every nood connected to each other
//->each nood information about the next and previous noods 
//->fist nood does not information about the previous nood and last nood does not information about the next nood
//->internally store data used by dobblelinkedlist
//->linkedlist dons not store the element by using index
//->initial and incremenatal capacity is not applicable
//->linkedlist does not have any shifting operations 
//->linkedlist also implement marker interface like serilizable and clonable but not random access
