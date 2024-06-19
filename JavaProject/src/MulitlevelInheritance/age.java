package MulitlevelInheritance;

class seetha{
	int age1=50;
}
class geetha extends seetha{
	int age2=39;
}
class rani extends geetha{
	int age3=21;
}
public class age {
public static void main(String[] args) {
	rani r = new rani();
	System.out.println(r.age1);
	System.out.println(r.age2);
	System.out.println(r.age3);
}
}
