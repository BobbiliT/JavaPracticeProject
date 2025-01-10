package Comprable_Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class student implements Comparable<student>{
	String name;
	int roll;
	int age;
	student(String name, int age, int roll){
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	public int compareTo(student s ) {
		if(age==s.age) {
			return 0;
		}
		else if(age>s.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class Comparable_class {
	public static void main(String[] args) {
		ArrayList<student> a = new ArrayList<student>();
		a.add(new student("tejesh", 01, 10));
		a.add(new student("teju", 02, 20));
		a.add(new student("tej", 03, 30));
		Collections.sort(a);
		for(student ss:a) {
			System.out.println(ss.name+" "+ss.roll+" "+ss.age);
		}
	}
}
