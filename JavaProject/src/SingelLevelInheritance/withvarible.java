package SingelLevelInheritance;

class parent{
	int a=30;
}
class child extends parent{
	int b=40;
}
public class withvarible {
public static void main(String[] args) {
	child c = new child();
	System.out.println(c.a);
	System.out.println(c.b);
}
}
