package ExceptionHandling;

public class Classnotfound_exception {
	public static void main(String[] args) {
		try {  
            Class<?> clazz = Class.forName("com.example.NonExistentClass");  
        } catch (ClassNotFoundException e) {  
            System.out.println("Class not found: " + e.getMessage());  
        }  
	}
}
