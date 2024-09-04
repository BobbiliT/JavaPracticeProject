package SuperKeyword;

import ThisKeyword.this_constructor;

public class super_constructor extends this_constructor{

	public super_constructor(String name) {
		super(name);
	}
	public super_constructor(String name, int id) {
		super(name,id);
	}
	public super_constructor(String name, int id, long number) {
		super(name,id,number);
	}
	public static void main(String[] args) {
		super_constructor s = new super_constructor("tejesh",10);
	}

}
