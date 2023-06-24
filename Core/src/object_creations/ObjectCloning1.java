package object_creations;

public class ObjectCloning1
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ObjectCloning objclone = new ObjectCloning();
		ObjectCloning clone = (ObjectCloning) objclone.clone();
	}
}