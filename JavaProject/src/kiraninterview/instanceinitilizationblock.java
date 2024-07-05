package kiraninterview;

public class instanceinitilizationblock {
	{
		System.out.println("iib1");
	}
	{
		System.out.println("iib2");
	}
	{
		System.out.println("iib3");
	}
	{
		System.out.println("iib4");
	}
	
public static void main(String[] args) {
	System.out.println("main method");
	new instanceinitilizationblock();
	new instanceinitilizationblock();
}
}
