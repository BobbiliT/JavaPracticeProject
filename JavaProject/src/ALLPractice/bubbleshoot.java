package ALLPractice;

import java.util.Arrays;

public class bubbleshoot {
public static void main(String[] args) {
	int arr[]= {10,30,50,70,90,20,40,60,80,100};
	System.out.println("array before bobble shooting :"+Arrays.toString(arr));
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("array after bobble shooting :"+Arrays.toString(arr));
}
}
