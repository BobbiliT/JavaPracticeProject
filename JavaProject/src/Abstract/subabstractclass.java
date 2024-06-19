package Abstract;

public class subabstractclass extends Creatabstractclass {

	@Override
	void test1() {
		System.out.println("this is test 1");
		
	}

	@Override
	void test2() {
		System.out.println("this is test 2");
		
	}

	@Override
	void test3() {
		System.out.println("this is test 3");
		
	}
	int k;
	String  l;
	public subabstractclass(int i, String j, int k, String l) {
		super(k,l);
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
		subabstractclass sa = new subabstractclass(5,"tejesh", 6, "bobbili");
		sa.test1();
		sa.test2();
		sa.test3();
		System.out.println(sa.i);
		System.out.println(sa.j);
		
	}

}
