package ALLPractice;

import java.util.Arrays;

public class even_odd {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = 0;
		for (int j = arr.length - 1; j >= i; j--) {
			if (arr[i] % 2 != 0) {
				if (arr[j] % 2 == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				} else {
					j--;
				}
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}