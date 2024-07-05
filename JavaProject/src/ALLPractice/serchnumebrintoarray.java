package ALLPractice;

import java.util.Scanner;

public class serchnumebrintoarray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	System.out.println("enter your number: ");
	Scanner s = new Scanner(System.in);
	int ser_num=s.nextInt();
	boolean result=false;
	for(int i=0; i<arr.length; i++) {
		if(ser_num==arr[i]) {
			System.out.println("seraching element is found and it's index: "+i);
		result=true;
		}
	}
	if(result==false) {
		System.out.println("seraching element is not found.");
	}
}
}
