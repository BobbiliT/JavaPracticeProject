package INTERVIEWPROGRAM13arraysequalotnot;

public class arrayeqaul {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		boolean result=true;
		if(a.length==b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]!=b[i])
					System.out.println("array is equal :"+a[i]);
				result=true;
			}
		}
		else {
			result=false;
		}
		if(result==true) {
			System.out.println("array is equal");
		}
		else {
			System.out.println("array is not equal");
		}
	}

}
