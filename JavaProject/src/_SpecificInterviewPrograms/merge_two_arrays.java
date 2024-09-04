package _SpecificInterviewPrograms;

import java.util.Arrays;

public class merge_two_arrays {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60 };
		int ch[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			ch[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			ch[i + a.length] = b[i];
		}
		System.out.println(Arrays.toString(ch));
	}
}
