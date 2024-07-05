package ALLPractice;

public class findduplicatefromarray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,2,4};
	boolean result=false;
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println("duplicate is found: "+arr[i]);
				result=true;
			}
		}
	}
	if(result==false) {
		System.out.println("duplicate is not found.");
	}
}
}
