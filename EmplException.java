
import java.util.Scanner;
import java.lang.Exception;

public class EmplException extends Exception {
	
	EmplException(String s)
	{
		System.out.println(s);
	}
	
	 static int EmpAge;
	 static double EmpSal;
	 static double sumsal = 0;
	 static double AvgSal;
	
	public static void acceptNames() {
		
	System.out.println("Enter Employee Names:");
	Scanner name = new Scanner(System.in);
	String[] empname = new String[10];
	
	for(int i = 0; i<empname.length; i++) {
		
		empname[i] = name.nextLine();
		
		}
	}
	
	
 public static void AgeException() {
	 
	 System.out.println("Enter Employee Ages:");
	 Scanner age = new Scanner(System.in);
	 int[] empage = new int[10];
	 
	 for(int j = 0; j<empage.length; j++) {
			
			empage[j] = age.nextInt();
			EmpAge = empage[j];
		try
		{
			if(EmpAge < 21)
				throw new EmplException("AGE cannot be less than 21");
		}
		
		catch(EmplException a)
		{
			System.out.println(a.getMessage());
		}
	 
	 }
}
	
public static void SalaryException() {
		 
		 System.out.println("Enter Employee Salaries:");
		 Scanner sal = new Scanner(System.in);
		 double[] empsal = new double[10];
		 
		 for(int k = 0; k<empsal.length; k++) {
				
				empsal[k] = sal.nextDouble();
				EmpSal = empsal[k];
				sumsal = sumsal + EmpSal;
				AvgSal = sumsal/10;
				
			try
			{
				if(EmpSal == 0)
					throw new EmplException("SALARY cannot be zero");
				
				if(AvgSal < 100000)
					throw new Exception("AVERAGE SALARY cannot be less than 1 lakh");
			}
			
			catch(EmplException s)
			{
				System.out.println(s.getMessage());
			}
			
			catch(Exception as)
			{
				System.out.println(as.getMessage());
			}
					
		}
	
	 }
	 
	 public static void main(String[] args) {
		 
		 try
		 {
			 acceptNames();
			 AgeException();
			 SalaryException();
			 
		 }
		 
		 catch(Exception e)
		 
		 {
			 System.out.println("Exception found");
		 }

	 }

}
	 

	
	
	
