package Encapsulation;

public class Employ {

	private String name;
	private int id;
	private long salary;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public long getsalary() {
		System.out.println("manager provided monthly salary");
		return salary;
	}
	public void setsalary(long salary) {
		System.out.println("employ ask monthly salary.");
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employ e = new Employ();
		e.setname("tejesh");
		e.setid(102);
		e.setsalary(50000);
		System.out.println("employ name :"+e.getname());
		System.out.println("employ id :"+e.getid());
		System.out.println("employ salary :"+e.salary);
	}
}
