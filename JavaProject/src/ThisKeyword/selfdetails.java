package ThisKeyword;

public class selfdetails {
	String name;
	int age;
	String sex;
	long number;
	selfdetails(String name, int age, String sex, long number){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.number=number;
	}
	public void details() {
		System.out.println(name+" "+age+" "+sex+" "+number);
	}
	public static void main(String[] args) {
		selfdetails s = new selfdetails("tejesh", 25, "male", 7036060404L);
		s.details();
	}
}
