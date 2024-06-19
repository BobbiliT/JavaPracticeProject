package Collections;

import java.util.Collections;
import java.util.Stack;

public class StackProgarm {
public static void main(String[] args) {
	Stack<String> st = new Stack<String>();
	st.add("arraylist");
	st.add("vector");
	st.add("stack");
	st.add("linkedlist");
	st.add("collction");
	System.err.println("print the list :");
	System.out.println(st);
	System.err.println("size the total elements :");
	System.out.println(st.size());
	System.err.println("capacity of the list :");
	System.out.println(st.capacity());
	System.err.println("push element from the list :");
	st.push("object");
	System.out.println(st);
	System.err.println("peek element from the list :");
	System.out.println(st.peek());
	Collections.sort(st);
	System.err.println("sort the elements from the list :");
	System.out.println(st);
	System.err.println("pop element from the list :");
	System.out.println(st.pop());
	System.err.println("check stack list empty or not :");
	System.out.println(st.isEmpty());
	System.err.println("clear the stack list :");
	st.clear();
	System.out.println(st);
	System.err.println("after clear the stack list try to check stack list empty or not :");
	System.out.println(st.isEmpty());
}
}
//->stack is a liner data structer that is use to store the data to collection object. it is based on (lifo) principale
//last in first out
//->java collection framework provides many interfaces and class to store the collection object
//->stack also providing different operation like push,pop,search,pick
//->stack data structer has two different operation push and pop, push operation insert elements from the list and pop operation
//remove elment form the top of the list 
//->if the stack is empty it will return emplty list
