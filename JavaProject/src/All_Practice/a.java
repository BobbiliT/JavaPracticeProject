package All_Practice;

public class a {

	public static void main(String[] args) {
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10};
		
		int n1 = arr1.length; 
		int n2 = arr2.length;
		
		int output[] = new int[n1+n2];
		
		int i = 0, j = 0, k=0;
		
		while(i<n1&&j<n2) {
			if(arr1[i]<arr2[j]) {
				output[k++] = arr1[i++];
			}
			else {
				output[k++] = arr2[j++];
			}
		}
		while(i<n1) {
			output[k++] = arr1[i++];
		}
		while(j<n2) {
			output[k++] = arr2[j++];
		}
		for(int l = 0; l<output.length; l++) {
			System.out.print(output[l]);
		}
	}
}
