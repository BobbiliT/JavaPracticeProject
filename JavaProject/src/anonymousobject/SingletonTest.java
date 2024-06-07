package anonymousobject;


public class SingletonTest {
	private static SingletonTest instance;
	public static int i;
	 
    //Private constructor to prevent instantiation of the class from other classes.
    private SingletonTest(){}
 
    public static SingletonTest getInstance(){
    	if(instance == null){
            instance = new SingletonTest();
        }
        return instance;
    }
}
