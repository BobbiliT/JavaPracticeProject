package garbagecollection;

public class gcollection {
	public void finalize(){
		System.out.println("object is garbage collection.");
	}
public static void main(String[] args) {
	gcollection g = new gcollection();
	gcollection g1 = new gcollection();
	gcollection g2 = new gcollection();
	System.out.println("hashcode is :"+g.hashCode());
	new gcollection();
	
	g=null;
	g1=g2;
	
	System.gc();
}
}
