package ThisKeyword;

public class name {

	String name;
	int age;
	public void mat(String name) {
		System.out.println(name); 
	}
	public void mat(String name, int age) {
		this.mat(name);
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		name n = new name();
		n.mat("tejesh", 10);
	}
}
