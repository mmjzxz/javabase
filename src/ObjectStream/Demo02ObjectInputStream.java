package ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("Data\\Demo01ObjectOutputStreamPerson.txt"));
		Object object = ois.readObject();
		System.out.println(object);
		
		ois.close();
		
		Person person = (Person)object;
		System.out.println(person.getName()+person.getAge());
	}
}
