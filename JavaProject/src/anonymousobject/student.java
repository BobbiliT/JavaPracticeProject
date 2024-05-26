package anonymousobject;

public class student {
	public void fact(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("total factorial is :"+fact);
	}
public static void main(String[] args) {
	new student().fact(5);//this is anonymous object.
	
	student s = new student();   //this is the reference object.
	s.fact(5);
}
}

