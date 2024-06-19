package CallbyReferenceandCallbyValue;

public class CallByValue {

    int data=10;
	void update(int a) {
		data=data+a;
	}
public static void main(String[] args) {
	CallByValue c = new CallByValue();
	System.out.println("before call by value "+c.data);
	c.update(10);
	System.out.println("after call by value "+c.data);
}
}
//in the call by value method of the parameter passing.
//the value of actual paramter are coppied to fucntion of the formal parameter.