package week2;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) 
	{
		
			System.out.println(empName);
			System.out.println(empId);
			}
		public void getEmployeeAddress(String empAddress)
		{
		
			System.out.println("empAddress:"+empAddress);
		}
		public void printEmployeeSalary(double empSalary)
		{
			
			System.out.println("empSalary:"+empSalary);
		}
		public void printEmployeeMobileNumber(long mobileNum)
		{
			System.out.println("mobileNum:"+mobileNum);
		}
		
public static void main(String[] args) 
		{
			EmployeeDetails emp=new EmployeeDetails();
			emp.printEmployeeName("saranya",409);
		        emp.getEmployeeAddress("pollachi");
			emp.printEmployeeSalary(56000.80);
			emp.printEmployeeMobileNumber(7904616837L);

		
	}

		
}

