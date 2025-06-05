package INTERVIEWPROGRAM04palindrome;

public class longest_palindrome {

	static boolean checkpal(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low) != s.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	static String palindrome(String s) {
		int n = s.length();
		int maxlen = 1;
		int start = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (checkpal(s, i, j) && (j - i + 1) > maxlen) {
					start = i;
					maxlen = j - i + 1;
				}
			}
		}
		return s.substring(start, start + maxlen);
	}

	public static void main(String[] args) {
		String s = "abababcdaa";
		System.out.println(palindrome(s));
	}
}
