package object_creations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo
{
	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException
	{
		//1st way - Using new keyword
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(s1.id);
		System.out.println("Object created using new keyword");
		System.out.println("---------------------------------");

		//2nd way - Using newInstance()
		Student s2 = (Student) Class.forName("ObjectCreations.Student").newInstance();
		//Student s2 = Student.class.newInstance();
		System.out.println(s2);
		System.out.println(s2.id);
		System.out.println("Object created using newInstance()");
		System.out.println("---------------------------------");

		//3rd way - Using newInstance() of Constructor class  
		Constructor<Student> constr =  Student.class.getConstructor();
		Student s3 = constr.newInstance();
		System.out.println(s3);
		System.out.println(s3.id);
		System.out.println("Object created using newInstance() of Constructor class");
		System.out.println("---------------------------------");

		//4th way - Using clone()
		Student s4 = (Student) s3.clone();
		System.out.println(s4);
		System.out.println(s4.id);
		System.out.println("Object created using clone()");
		System.out.println("---------------------------------");

		//5th way - Using deserialization
		FileOutputStream fos = new FileOutputStream("text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s = new Student();
		oos.writeObject(s);

		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s5 = (Student) ois.readObject();
		System.out.println(s5);
		System.out.println(s5.id);
		System.out.println("Object created using deserialization");
	}
}