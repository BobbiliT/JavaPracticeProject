package INTERVIEWPROGRAM44secondhigestandlowestnumber;

import java.util.Arrays;

public class secondhigestnumebrformanArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	int a=arr.length;
	Arrays.sort(arr);
	System.out.println("second higest number form an Array :"+arr[a-2]);
}
}
