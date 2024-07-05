package INTERVIEWPROGRAM16findduplicateelements;

public class duplicatefound {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 3 };
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element found :" + arr[i]);
					b = true;
				}
			}
		}
		if (b == false) {
			System.out.println("duplicate is not found.");
		}
	}

}
