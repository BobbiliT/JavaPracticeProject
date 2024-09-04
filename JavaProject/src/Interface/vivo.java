package Interface;

public class vivo implements mobile{

	@Override
	public void music() {
		System.out.println("vivo provide music.");
	}

	@Override
	public void calling() {
		System.out.println("vivo provide calling.");
	}

	@Override
	public void browser() {
		System.out.println("vivo provide browser.");
	}

	@Override
	public void socialmedia() {
		System.out.println("vivo provide socialmedia");
	}
	public static void main(String[] args) {
		vivo v = new vivo();
		v.music();
		v.calling();
		v.browser();
		v.socialmedia();
		samsung s = new samsung();
		s.music();
		s.calling();
		s.browser();
		s.socialmedia();
		redmi r = new redmi();
		r.music();
		r.calling();
		r.browser();
		r.socialmedia();
	}
}
