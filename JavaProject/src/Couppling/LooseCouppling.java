package Couppling;

public interface LooseCouppling {

	void start();
	public class car implements LooseCouppling{
		public void start() {
			System.out.println("car start.");
		}
	}
	public class bike implements LooseCouppling{
		public void start() {
			System.out.println("bike start.");
		}
	}
	public static void main(String[] args) {
		LooseCouppling l = new car();
		l.start();
		LooseCouppling ll = new bike();
		ll.start();
	}
}

