package SerializationAndDeserialization;

import java.io.*;

public class Serialization {
public static void main(String[] args) {
	employ em = new employ();
	em.name="tejesh";
	em.address="rattakanna";
	try {
		FileOutputStream fileoutput = new FileOutputStream(".//SandDtest//Serializationdata.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileoutput);
		out.writeObject(em);
		out.close();
		fileoutput.close();
		System.out.println("Serialization data will be saved into SandDtest");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
