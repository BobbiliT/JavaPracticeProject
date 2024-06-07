package anonymousobject;

public class anonymouseobject {

	public void fact(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("total factorial is :"+fact);
	}
public static void main(String[] args) {
	new anonymouseobject().fact(5);//this is anonymous object.
	
	anonymouseobject s = new anonymouseobject();   //this is the reference object.
	s.fact(5);
}
}
