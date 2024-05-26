package INTERVIEWPROGRAM18bobbleshort;

import java.util.Arrays;

public class bobbleshort {
	public class bubbleshort {
		public static void main(String[] args) {
			int a[] = { 90, 40, 50, 60, 30, 20, 10, 70, 80 };
			System.out.println("array before shorting :" + Arrays.toString(a));
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = 0; j < a.length - 1; j++) {
					if (a[j] > a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
			System.out.println("array after shorting :" + Arrays.toString(a));
		}
	}
}
