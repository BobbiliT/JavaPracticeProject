package Interface;

public class studentnames implements school{

	@Override
	public void student1() {
		System.out.println("tejesh");
	}

	@Override
	public void student2() {
		System.out.println("kamesh");
	}

	@Override
	public void student3() {
		System.out.println("ramesh");
	}
	public static void main(String[] args) {
		studentnames sn = new studentnames();
		sn.student1();
		sn.student2();
		sn.student3();
	}
}
