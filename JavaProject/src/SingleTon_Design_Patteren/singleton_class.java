package SingleTon_Design_Patteren;

class single{
	static single s = new single();
	private single(){
		
	}
	public static single getInstance() {
		return s;
		
	}
}
public class singleton_class {
	public static void main(String[] args) {
		single s1 = single.getInstance();
		single s2 = single.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
