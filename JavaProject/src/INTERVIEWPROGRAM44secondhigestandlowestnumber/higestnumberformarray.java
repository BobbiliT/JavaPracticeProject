package INTERVIEWPROGRAM44secondhigestandlowestnumber;

public class higestnumberformarray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 10, 20, 30, 40, 50 };
		int a = arr.length;
		int higest = Integer.MIN_VALUE;
		int sechigest = Integer.MIN_VALUE;
		for (int i = 0; i < a; i++) {
			if (arr[i] > higest) {
				sechigest = higest;
				higest = arr[i];
			}
			if (arr[i] < higest && arr[i] > sechigest) {
				sechigest = arr[i];
		}
		}
		System.out.println("second higestnumber form an Array :" + sechigest);
	}
}
