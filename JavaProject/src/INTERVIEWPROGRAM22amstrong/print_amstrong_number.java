package INTERVIEWPROGRAM22amstrong;

public class print_amstrong_number {
	public static void main(String[] args) {
		int i = 1, a, b, c;
		while (i <= 500) {
			a = i % 10;
			b = i % 100;
			b = (b - a) / 10;
			c = i / 100;
			if ((a * a * a) + (b * b * b) + (c * c * c) == i)
				System.out.println(i);
			i++;

		}
	}
}
