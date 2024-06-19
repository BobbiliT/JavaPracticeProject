package HierarchicalInheritance;


class tejesh{
	public void m1() {
		String s1="car";
		System.out.println("bmw");
	}
}
class ramesh extends tejesh{
	public void m2() {
		String s2="bike";
		System.out.println("ktm");
	}
}
class suresh extends tejesh{
	public void m3() {
		String s3="cycle";
		System.out.println("atlas");
	}
}
public class ByUsingString {
public static void main(String[] args) {
	suresh s = new suresh();
	s.m1();
	s.m3();
	ramesh r = new ramesh();
	r.m1();
	r.m2();
}
}
