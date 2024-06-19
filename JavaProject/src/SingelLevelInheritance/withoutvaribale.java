package SingelLevelInheritance;

class bike{
	public void bikename() {
		System.out.println("ktm");
	}
}
class car extends bike{
	public void carname() {
		System.out.println("altroz");
	}
}
public class withoutvaribale {
public static void main(String[] args) {
	car c = new car();
	c.bikename();
	c.carname();
}
}
