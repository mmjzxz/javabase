package ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo03ObjectStreamTest {
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("¹ÅÁ¦ÄÈÔú",18));
		list.add(new Person("µÏÀöÈÈ°Í",18));
		list.add(new Person("Âí¶ûÔú¹þ",20));
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("Data\\Demo03ObjectStreamTest.txt"));
		oos.writeObject(list);
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("Data\\Demo03ObjectStreamTest.txt"));
		Object object = ois.readObject();
		
		ArrayList<Person> list2 = (ArrayList<Person>)object;
		for (Person person : list2) {
			System.out.println(person);
		}
		
		ois.close();
		oos.close();
	}
}
