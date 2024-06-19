package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueProgram {
public static void main(String[] args) {
	PriorityQueue<String> p = new PriorityQueue<String>();
	p.offer("aa");
	p.add("bb");
	p.add("cc");
	p.offer("dd");
	System.err.println("print the list ");
	System.out.println(p);
	System.err.println("print the list using iterator :");
	Iterator<String> i = p.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.err.println("size of the list :");
	System.out.println(p.size());
	System.err.println("check the element present in the list or not :");
	System.out.println(p.contains("aa"));
}
}
//->the queue interface is avaliable in java.until.pakage,it does not extedns the collection interface
//->it is used to keep the elements that are proecss in (fifo) means first in first out 
//->it is an a order of the list
//->inserat the elements occurse at the end of the list
//->removing the elements occurse at the begining of the list 
//->the java queue provied to support all of the methods in the collection interface including delection and insertion,
//->queue is introdued multi data stracter and fifo priniciple are using 
//->priority is not followed the short ordr, head is the point of high priority in priority queue
