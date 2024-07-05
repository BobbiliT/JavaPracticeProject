package INTERVIEWPROGRAM14missingnumber;

import java.util.TreeSet;

public class finduniquenumebrgivenarray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 3, 2, 5, 7, 6 };
		TreeSet<Integer> un = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			un.add(arr[i]);
		}
		System.out.println(un);
	}
}
