package stat1c;

public class StaticVar
{
	int employeeId;
	String employeeName;
	float employeeSalary;
	String companyName;
	StaticVar(int employeeId, String employeeName, float employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	void employeeInfo()
	{
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Salary:"+employeeSalary);
		System.out.println("Employee Company:"+companyName);
	}
	public static void main(String[] args)
	{
		StaticVar emp1 = new StaticVar(1,"Alex",30000);
		StaticVar emp2 = new StaticVar(1,"BOb",30000);
		emp1.companyName="ABC";
		emp1.companyName="ABC";
		//StaticVar.companyName="XYZ";
		emp1.employeeInfo();
		emp2.employeeInfo();
	}
}