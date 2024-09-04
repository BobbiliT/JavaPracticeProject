package Abstract;

public class ktm extends bike{

	@Override
	public void cc() {
		System.out.println("ktm cc is -> 125");
	}

	@Override
	public void prize() {
		System.out.println("ktm prize is -> 3,00,000");
	}

	@Override
	public void color() {
		System.out.println("ktm color is -> red and white");
	}
	public static void main(String[] args) {
		ktm k = new ktm();
		k.cc();
		k.prize();
		k.color();
	}

}
