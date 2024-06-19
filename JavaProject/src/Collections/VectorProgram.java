package Collections;

import java.util.Collections;
import java.util.Vector;

public class VectorProgram {
public static void main(String[] args) {
	Vector<String> vc = new Vector<String>();
	vc.add("aa");
	vc.add("bb");
	vc.add("dd");
	vc.add("cc");
	vc.add("ee");
	vc.add("ff");
	System.err.println("print the vector list :");
	System.out.println(vc);
	System.err.println("short the data :");
	Collections.sort(vc);
	System.out.println(vc);
	System.err.println("size of the list :");
	System.out.println(vc.size());
	System.err.println("capcity of the list :");
	System.out.println(vc.capacity());
	System.err.println("adding some element into the list :");
	Vector<String> vb = new Vector<String>();
	vb.add("gg");
	vb.add("hh");
	vc.addAll(vb);
	System.out.println(vc);
	System.err.println("reterving the element from the list :");
	System.out.println(vc.get(3));
	System.err.println("removing the element from the list :");
	System.out.println(vc.remove(2));
	System.out.println(vc);
	System.err.println("verification elements from the list :");
	System.out.println(vc.contains("dd"));
	System.out.println(vc.contains("ee"));
	System.err.println("update element from the list :");
	vc.set(3, "zz");
	System.out.println(vc);
	System.err.println("clear all the elements from the list :");
	vc.clear();
	System.out.println(vc);
}
}
//->vector is one of the implementation class of list interface. presented by jdk 1.0 it is legacy collection
//->vector is a single thread the method are synchronized
//->arraylist vector store the date in the form of array and implement the data structer resizeable and growable
//->the initial capacity is 10 and incremental capacity is currrent capacity*2 is double
//->vector also impliment marker interface like serilizable and clonable and random access\
//->arraylist vector also has shifting operations
//->vector is index bades it can store the duplicate and null value and it maintain inserction order