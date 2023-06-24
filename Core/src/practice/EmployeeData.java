package practice;

import java.util.Scanner;
public class EmployeeData
{
	public static void main(String[] args)
	{
		String name, dept, address;
		int id;
		float salary;
		
		Scanner sc=new Scanner(System.in); //"System" is a Class and "in" is a final static variable
		
		System.out.println("Enter Your Name: ");
		name=sc.nextLine();   
		System.out.println("Enter your ID : ");
		id=Integer.parseInt(sc.nextLine());  
		System.out.println("Enter your Salary: ");
		salary=Float.parseFloat(sc.nextLine());
		System.out.println("Enter your Department: ");
		dept=sc.nextLine();
		System.out.println("Enter your Address: ");
		address=sc.nextLine();
		sc.close();
		
		System.out.println("----------Employee Details----------");
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + dept);
		System.out.println("Address : " + address);
	}
}