package INTERVIEWPROGRAM44secondhigestandlowestnumber;

public class secondhigest {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,1,2,3,4,5,6};
	int a=arr.length;
	int higest=Integer.MIN_VALUE;
	int secondhigest=Integer.MIN_VALUE;
	for(int i=0; i<a; i++) {
		if(arr[i]>higest) {
			secondhigest=higest;
			higest=arr[i];
		}
		if(arr[i]<higest&&arr[i]>secondhigest) {
			secondhigest=arr[i];
		}
	}
	System.out.println("second higest number form an Array :"+secondhigest);
}
}
