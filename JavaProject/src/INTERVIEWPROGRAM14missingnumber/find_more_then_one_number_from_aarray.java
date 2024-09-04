package INTERVIEWPROGRAM14missingnumber;

import java.util.HashSet;

public class find_more_then_one_number_from_aarray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,7,8,9,10};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int num:arr) {
			hs.add(num);
		}
		for(int i=1; i<arr.length+1; i++) {
			if(!hs.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
