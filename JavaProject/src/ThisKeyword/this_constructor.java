package ThisKeyword;

public class this_constructor {

	String name;
	int id;
	long number;
	
	public this_constructor(String name) {
		System.out.println(name);
	}
	public this_constructor(String name,int id) {
		this(name);
		System.out.println(name);
		System.out.println(id);
	}
	public this_constructor(String name, int id, long number) {
		this(name,id);
		System.out.println(name);
		System.out.println(id);
		System.out.println(number);
	}
	public static void main(String[] args) {
		this_constructor t = new this_constructor("tejesh",10);
	}
}
