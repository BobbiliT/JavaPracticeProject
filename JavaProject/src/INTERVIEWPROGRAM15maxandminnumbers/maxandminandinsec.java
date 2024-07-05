package INTERVIEWPROGRAM15maxandminnumbers;

public class maxandminandinsec {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int max = arr[0];
		int maxindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i;
			}
		}
		System.out.println("max number from an array :" + max);
		System.out.println("max number index from an array :" + maxindex);

		int min = arr[0];
		int minindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minindex = i;
			}
		}
		System.out.println("min number from an array :" + min);
		System.out.println("min number index from an array :" + minindex);
	}
}
