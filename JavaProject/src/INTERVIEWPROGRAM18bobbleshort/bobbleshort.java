package INTERVIEWPROGRAM18bobbleshort;

import java.util.Arrays;

public class bobbleshort {
	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 5, 3 };
		System.out.println("array before shorting :" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("array after shorting :" + Arrays.toString(a));
	}
}
