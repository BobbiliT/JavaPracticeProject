package SuperKeyword;

class book{
	public void result() {
		System.out.println("this is a book");
	}
}
class paper extends book{
	public void result() {
		System.out.println("this is a paper");
		super.result();
	}
}
public class superkeyword {
public static void main(String[] args) {
	paper p = new paper();
	p.result();
}
}
//super is keyword which is use to representative the object of immediately super class
//super keyword is used in sub-class to class or invok the super class method and vriables