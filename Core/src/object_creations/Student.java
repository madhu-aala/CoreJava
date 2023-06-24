package object_creations;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Cloneable, Serializable
{
	int id;
	public Student()
	{
		System.out.println("Student class constructor");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}