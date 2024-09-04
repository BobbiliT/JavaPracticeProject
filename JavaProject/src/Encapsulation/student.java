package Encapsulation;

public class student {
	
	private String name;
	private int roll_no;
	private long number;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getroll_no() {
		return roll_no;
	}
	public void setroll_no(int roll_no) {
		this.roll_no=roll_no;
	}
	public long getnumber() {
		return number;
	}
	public void setnumber(long number) {
		this.number=number;
	}
	public static void main(String[] args) {
		student s = new student();
		s.setname("tejesh");
		s.setroll_no(10);
		s.setnumber(7036060404L);
		System.out.println(s.getname());
		System.out.println(s.getroll_no());
		System.out.println(s.getnumber());
	}
}
