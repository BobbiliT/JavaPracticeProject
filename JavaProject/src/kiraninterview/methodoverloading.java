package kiraninterview;

public class methodoverloading {
	public void math(String name) {
		System.out.println("student name ->"+name);
	}
	public void math(String name, int id) {
		System.out.println("student name ->"+name+" student id ->"+id);
		
	}
public static void main(String[] args) {
	methodoverloading mover = new methodoverloading();
	mover.math("tejesh");
	mover.math("tejesh", 12);
}
}
