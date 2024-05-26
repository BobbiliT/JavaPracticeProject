package loop;

public class whileloop {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int sum=0;
	int i=0;
	while(i<a.length) {
		sum=sum+a[i];
		i++;
	}
	System.out.println("sum of array is :"+sum);
}
}
