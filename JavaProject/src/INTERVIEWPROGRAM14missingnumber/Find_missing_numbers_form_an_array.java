package INTERVIEWPROGRAM14missingnumber;

import java.util.Arrays;

public class Find_missing_numbers_form_an_array {

	public static void main(String[] args) {
		int arr[] = { 11, 16 };
		Arrays.sort(arr);
		int diff = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != diff) {
				while (diff < arr[i] - i) {
					System.out.print((i + diff) + " ");
					diff++;
				}
			}
		}
	}
}
