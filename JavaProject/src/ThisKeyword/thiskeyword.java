package ThisKeyword;

class student{
	String name;
	int id;
	int rn;
	student (String name, int id, int rn) {
		this.name=name;
		this.id=id;
		this.rn=rn;
	}
	public void detials(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(rn);
	}
}
public class thiskeyword {
public static void main(String[] args) {
	student s = new student("tejesh", 102, 11);
	s.detials();
}
}
