import java.util.Scanner;
class EmployeeData 
{
	public static void main(String[] args) 
	{
		//creation of scanner object
		Scanner s=new Scanner(System.in);
		
		//Read data from command prompt
		System.out.println("Enter emp id...");
		int empId = s.nextInt();

		System.out.println("Enter emp name...");
		String empName = s.next();

		System.out.println("Enter emp salary...");
		double empSalary = s.nextDouble();

		//close the scanner object
		s.close();
        
		if(empSalary < 5000)
		{
			System.out.println("He is poor employee");
			System.out.println("emp id..."+empId);
			System.out.println("emp name..."+empName);
			System.out.println("emp salary..."+empSalary);
		}
		else
		{
			System.out.println("He is rich employee");
			System.out.println("emp id..."+empId);
			System.out.println("emp name..."+empName);
			System.out.println("emp salary..."+empSalary);
		}
		
          

	}
}
