package practice;

public class ClassJ {
	int a=10;
	public String testmethod()
	{
		new ClassJ(100,200,"java");
		System.out.println(40);
		return(new ClassJ().testmethod3(new ClassJ(50).testmethod2())
				+new ClassJ().testmethod4("hi"));
	}
	ClassJ(){
		System.out.println("hi");
	}
	public int testmethod2() {
		System.out.println(50);
		return 10+15;
	}
	ClassJ(int a){
		System.out.println("java is awesome");
	}
	public String testmethod3(int a)
	{
		System.out.println(18);
		return "is";
	}
	ClassJ(int a,int b,String s){
		System.out.println(a+b);
		System.out.println(s);
	}
	public String testmethod4(String s)
	{
		System.out.println(88);
		return "Good";
	}
	public static void main(String[] args)
	{
		ClassJ t1=new ClassJ();
		t1.a=10;
		ClassJ t2=new ClassJ(50);
		t2.a=30;
		System.out.println("java"+t1.testmethod()+" "+(t1.a+t2.a-30));
	}
}