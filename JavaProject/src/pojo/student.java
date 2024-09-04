package pojo;

public class student {

	private String name;
	private int id;
	private long number;
	private double marks;
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setnumber(long number) {
		this.number=number;
	}
	public long getnumber() {
		return number;
	}
	public void setmarks(Double marks) {
		this.marks=marks;
	}
	public double getmarks() {
		return marks;
	}
	public static void main(String[] args) {
		student s = new student();
		s.setname("tejesh");
		s.setid(101);
		s.setnumber(7036060404L);
		s.setmarks(54.5);
		System.out.println("student name :"+s.getname());
		System.out.println("student id :"+s.getid());
		System.out.println("student number :"+s.getnumber());
		System.out.println("student marks :"+s.getmarks());
	}
}
