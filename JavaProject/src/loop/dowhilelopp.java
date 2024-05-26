package loop;

public class dowhilelopp {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int sum=0;
	int i=0;
	do {
		sum=sum+a[i];
		i++;
	}
	while(i<a.length);
	System.out.println("sum of array is :"+sum);
}
}
