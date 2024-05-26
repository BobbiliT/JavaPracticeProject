package INTERVIEWPROGRAM16findduplicateelements;

public class findduplicateELEMENTS {
	public static void main(String[] args) {
		String arr[] = { "tejesh", "murali", "giri", "mohan", "lakshman", "tejesh" };

		boolean flage = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element is found :" + arr[i]);
					flage = true;
				}
			}
		}
		if (flage == false) {
			System.out.println("duplicate element is not found");
		}
	}

}
