package INTERVIEWPROGRAM08fibonacciserious;

public class betweenfibnoccinumber {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 10;
		int sum = 0;
		for (int i = num1; i <= 10; i++) {
			sum = num1 + num2; // 30+50=80
			System.out.println(sum); // 10
			num1 = num2;
			num2 = sum;

		}
	}

}
