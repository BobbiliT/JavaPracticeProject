package INTERVIEWPROGRAM29removeduplicateelement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class printcommonvalues {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {1,3,5,7};
	List<Integer> commonnumber = new ArrayList<Integer>();
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<b.length; j++) {
			if(a[i]==b[j]) {
				commonnumber.add(a[i]);
			}
		}
	}
	System.out.println("common elements is :"+commonnumber);
	Iterator i = commonnumber.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
