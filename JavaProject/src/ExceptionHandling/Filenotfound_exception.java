package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filenotfound_exception {
	public static void main(String[] args) throws Exception{
		try {
			File file = new File("emptyfile_file.txt");
			Scanner s = new Scanner(file);
		}
		catch(FileNotFoundException e){
			System.out.println("file not found = "+e.getMessage());
		}
	}
}
