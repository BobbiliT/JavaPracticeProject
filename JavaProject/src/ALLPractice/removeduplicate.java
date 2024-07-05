package ALLPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {
public static void main(String[] args) {
	String arr[]= {"a","b","c","d","a","b","c","d"};
	Set<String> s = new LinkedHashSet<String>();
	for(int i=0; i<arr.length; i++) {
		s.add(arr[i]);
	}
	System.out.println(s);
	for(String ss:s) {
		System.out.println(ss);
	}
}
}
