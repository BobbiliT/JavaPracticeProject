package ThisKeyword;

public class person {
	public void firstname() {
		System.out.println("tejesh");
	}
	public void lastname() {
		System.out.println("bobbili");
		this.firstname();
	}
	public static void main(String[] args) {
		person p = new person();
		p.lastname();
	}
}
