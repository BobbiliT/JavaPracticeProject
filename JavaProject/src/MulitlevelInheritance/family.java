package MulitlevelInheritance;

class grandmother{
	public void name1() {
		System.out.println("seetha");
	}
}
class mother extends grandmother{
	public void name2() {
		System.out.println("geetha");
	}
}
class doughter extends mother{
	public void name3() {
		System.out.println("rani");
	}
}
public class family {
public static void main(String[] args) {
	doughter d = new doughter();
	d.name1();
	d.name2();
	d.name3();
}
}
