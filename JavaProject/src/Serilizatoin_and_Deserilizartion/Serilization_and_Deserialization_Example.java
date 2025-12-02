package Serilizatoin_and_Deserilizartion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class person implements Serializable {
	String name;
	int id;

	public person(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

public class Serilization_and_Deserialization_Example {
	public static void main(String[] args) throws Exception {
		person p = new person("tejesh", 10);
		
		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p);
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		person pp = (person) ois.readObject();
		System.out.println(pp.name + "=" + pp.id);
		ois.close();
		fis.close();
	}
}
