package INTERVIEWPROGRAM12arrayevenandoddnumbers;

public class printarrayformevenandoddnumbers {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("print even numbers form an array :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println(arr[i]);
		}
		System.out.println("print odd numbers form an array :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1)
				System.out.println(arr[i]);
		}
	}

}
