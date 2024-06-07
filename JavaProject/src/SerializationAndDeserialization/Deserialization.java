package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) throws Exception {
	employ emp=null;
	try{
		FileInputStream fileinput = new FileInputStream(".//SandDtest//Serializationdata.txt");
		ObjectInputStream input = new ObjectInputStream(fileinput);
		emp = (employ)input.readObject();
		input.close();
		fileinput.close();
	}
	finally {
		System.out.println("Deserialization employ ");
		System.out.println("employ name :"+emp.name);
		System.out.println("employ address :"+emp.address);
	}
}
}
