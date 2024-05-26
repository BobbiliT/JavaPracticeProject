package INTERVIEWPROGRAM12arrayevenandoddnumbers;

public class sumofevenandodd {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("even numbers from an array :"+a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println("sum of even :"+sum);
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==1) {
				System.out.println("odd numbers from an array :"+a[i]);
				sum=sum+a[i];
			}
		}
		System.err.println("sum of odd numbers :"+sum);
	}

}
