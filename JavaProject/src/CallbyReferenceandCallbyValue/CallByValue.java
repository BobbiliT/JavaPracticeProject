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
