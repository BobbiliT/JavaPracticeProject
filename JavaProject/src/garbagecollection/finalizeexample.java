package garbagecollection;

public class finalizeexample {
public static void main(String[] args) {
	finalizeexample f = new finalizeexample();
	System.out.println("hashcode is :"+f.hashCode());
	f=null;
	System.gc();
	System.out.println("end of garbage collection.");
}
}
