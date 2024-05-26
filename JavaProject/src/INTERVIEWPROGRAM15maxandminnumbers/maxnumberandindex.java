package INTERVIEWPROGRAM15maxandminnumbers;

public class maxnumberandindex {
	public static void main(String[] args) {
		int arr[]= {1,2,8,4,5,6};
		int max=arr[0];
		int maxindex=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxindex=i;
			}
		}
		System.out.println("max number from an array :"+max);
		System.out.println("maxindex number form an array is :"+maxindex);
	}

}
