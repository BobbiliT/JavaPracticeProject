package INTERVIEWPROGRAM15maxandminnumbers;

public class minnumberandindex {
	public static void main(String[] args) {
		int arr[]= {3,2,1,4,5,6};
		int min=arr[0];
		int minindex=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
				minindex=i;
			}
		}
		System.out.println("minmum number from an array is :"+min);
		System.out.println("minmum index number form an array is :"+minindex);
	}

}
