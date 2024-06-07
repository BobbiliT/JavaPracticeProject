package INTERVIEWPROGRAM44secondhigestandlowestnumber;

public class lowestnumberformanarray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,10,20,30,40,50};
	int a=arr.length;
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
	System.out.println("seond lowest number form an Array :"+secondlowest);
}
}
