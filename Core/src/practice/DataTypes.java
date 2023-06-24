package practice;

public class DataTypes
{
	int i;
	byte b;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean flag;
	void meth1()
	{
		System.out.println("Printing the default values of the data types");
		System.out.println("int value: "+i);
		System.out.println("byte value: "+b);
		System.out.println("short value: "+s);
		System.out.println("long value: "+l);
		System.out.println("float value: "+f);
		System.out.println("double value: "+d);
		System.out.println("char value: "+c);
		System.out.println("boolean value: "+flag);
	}
	void meth2()
	{
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);
		float f=18.23f;
		long l=2147483648L;
		System.out.println("byte: "+b3);
		System.out.println("float: "+f);
		System.out.println("long: "+l);
	}
	public static void main(String[] args)
	{
		DataTypes obj=new DataTypes();
		obj.meth1();
		obj.meth2();
	}

}
