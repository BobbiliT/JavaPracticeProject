package LinkedLine_Programs;

import java.security.DomainCombiner;
import java.util.Arrays;
import java.util.Scanner;

public class move_zero_end_of_array {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 0, 0, 0, 0, 3, 6 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}