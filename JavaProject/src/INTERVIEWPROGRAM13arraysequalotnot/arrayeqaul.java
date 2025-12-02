package INTERVIEWPROGRAM13arraysequalotnot;

public class arrayeqaul {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6};
		boolean result = true;
		if(a.length==b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]!=b[i]) {
					result = false;
					break;
				}
			}
		}
		else {
			result = false;
		}
		if(result) {
			System.out.println("both arrays are equal.");
		}
		else {
			System.out.println("both arrays are not equal.");
		}
	}	
}
