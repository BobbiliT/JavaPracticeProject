package INTERVIEWPROGRAM44secondhigestandlowestnumber;

public class lhigest {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,1,2,3,4,5,6};
	int a =arr.length;
	int lowest=Integer.MAX_VALUE;
	int secondlowest=Integer.MAX_VALUE;
	for(int i=0; i<a; i++) {
		if(arr[i]<lowest) {
			secondlowest=lowest;
			lowest=arr[i];
		}
		if(arr[i]>lowest&&arr[i]<secondlowest) {
			secondlowest=arr[i];
		}
	}
	System.out.println("second lowest value form an Array :"+secondlowest);
}
}
