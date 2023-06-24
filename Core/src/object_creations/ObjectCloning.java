package object_creations;

public class ObjectCloning implements Cloneable
{
	int id;
	public ObjectCloning()
	{
		System.out.println("Implementing Object Cloning");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}