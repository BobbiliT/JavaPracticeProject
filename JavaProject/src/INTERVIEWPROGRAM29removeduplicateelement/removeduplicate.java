package INTERVIEWPROGRAM29removeduplicateelement;

import java.util.Arrays;

public class removeduplicate {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 1, 3, 5, 7, 9, 2, 4, 6, 8 };
		Arrays.sort(a);
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length - 1];
		for (int k = 0; k <= j; k++) {
			System.out.print(a[k] + "");
		}
	}
}
