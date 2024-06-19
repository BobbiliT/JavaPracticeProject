package pojo;

public class employ {

	private String name;
	private int id;
	private double salary;
	private long phonenumber;
	
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
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public long getphonenumber() {
		return phonenumber;
	}
	public void setphonenumber(long phonenumber) {
		this.phonenumber=phonenumber;
	}
	public static void main(String[] args) {
		employ e = new employ();
		e.setname("tejesh");
		e.setid(101);
		e.setsalary(5000.0);
		e.setphonenumber(7036060404L);
		System.out.println("employ name :"+e.getid());
		System.out.println("employ id :"+e.getid());
		System.out.println("employ salary :"+e.getsalary());
		System.out.println("employ phonenumber :"+e.getphonenumber());
	}
}
//pojo stand for plain old java object, it is an ordanary java object it not bound by any specific restruction and also it is not required any class path
//pojo are used for increasing the readablity and reuseablity.
//The POJO class must be public.
//It must have a public default constructor.
//It may have the arguments constructor.
//All objects must have some public Getters and Setters to access the object values by other Java Programs.
//The object in the POJO Class can have any access modifies such as private, public, protected. But, all instance variables should be private for improved security of the project.
//A POJO class should not extend predefined classes.
//It should not implement prespecified interfaces.
//It should not have any prespecified annotation.