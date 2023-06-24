package practice;

import java.util.Scanner;

public class EmpDetails
{
	Scanner sc=new Scanner(System.in);
	void getEmpDetails()
	{
		System.out.println("Enter Your Name: ");
		String name=sc.next();
		System.out.println("Enter your ID : ");
		int id=sc.nextInt();  
		System.out.println("Enter your Salary: ");
		int salary=sc.nextInt();
		System.out.println("Enter your Department: ");
		String dept=sc.next();
		//String address=sc.nextLine();
		System.out.println("Enter your Address: ");
		String address=sc.next();

		System.out.println("----------Employee Details----------");
		System.out.println("Name : " + name);
		
		System.out.println("ID : " + id);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + dept);
		System.out.println("Address : " + address);
	}
	public static void main(String[] args)
	{
		EmpDetails obj=new EmpDetails();
		obj.getEmpDetails();
	}
}
