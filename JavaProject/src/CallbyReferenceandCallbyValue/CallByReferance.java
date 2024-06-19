package CallbyReferenceandCallbyValue;

public class CallByReferance {

	int data=10;
	void update(CallByReferance r1) {
		r1.data=r1.data+10;
	}
	public static void main(String[] args) {
		CallByReferance r1 = new CallByReferance();
		System.out.println("before call by referance :"+r1.data);
		r1.update(r1);
		System.out.println("after call by referance :"+r1.data);
	}
}
//in the call by referance method of the parameter passing. 
//the address of the actual parameter passing of functional as a formal paramter
