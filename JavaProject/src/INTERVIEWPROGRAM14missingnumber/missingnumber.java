package INTERVIEWPROGRAM14missingnumber;

public class missingnumber {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8,9};
		int sum1=0;
		for(int i=0; i<arr.length; i++) {
			sum1=sum1+arr[i];
		}
		System.out.println("sum of array is :"+sum1);
		
		int sum2=0;
		for(int i=0; i<=9; i++) {
			sum2=sum2+i;
		}
		System.out.println("range of array is :"+sum2);
		
		int sum=0;
		sum=sum2-sum1;
		System.out.println("missing number of array :"+sum);
	}

}
