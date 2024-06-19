package MethodOverriding;

class sleeping{
	String dog() {
		return "dog is sleeping.";
	}
}
class eating extends sleeping{
	String dog() {
		return "dog is eating";
	}
}
public class dogactives {
public static void main(String[] args) {
	eating e = new eating();
	System.out.println("dog daily activites :"+e.dog());
	sleeping s = new sleeping();
	System.out.println("dog daily activites :"+s.dog());
}
}
