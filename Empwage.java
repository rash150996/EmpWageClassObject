import java.io.*;
class Empdetails
{
	double empCheck=0.0;
	int jobType = 0;
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	int totalSalary = 0;
	int dailyWage = 0;
	int hours = 0;
	int wagePerHr= 0;
	int daysPerMonth= 0;
	int hrsPerMonth = 0;
	String company= "";

	public void getWelcomeMessage()
	{
		System.out.println("Welcome To Employee Wage Computation Process");
	}
}


interface Employee {

	final int IS_PRESENT = 1;
	public void getEmpWage(int empHrs, int wagePerHr, int daysPerMonth, int hrsPerMonth, String company);
}

class Empwage extends Empdetails implements Employee
{

	Empwage() { }

	public int getEmpHrs(int hrs)
	{
		this.hours = hrs;
		empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_PRESENT)
		{
			jobType = (int)Math.floor(Math.random() * 10) % 2;
			switch(jobType){
				case 1:
					empHrs=hours;
					break;
				case 0:
					empHrs=3;
					break;
				default:
					empHrs=0;
					break;
			}
		}

		return empHrs;
	}

	public void getEmpWage(int empHrs, int wagePerHr, int daysPerMonth, int hrsPerMonth, String company)
	{
		this.wagePerHr= wagePerHr;
		this.daysPerMonth= daysPerMonth;
		this.hrsPerMonth = hrsPerMonth;
		this.company= company;
		while ( totalWorkingDays <= daysPerMonth && totalEmpHrs <= hrsPerMonth )
		{
			empHrs=getEmpHrs(empHrs);
			totalWorkingDays+=1;
			if ( (totalEmpHrs + empHrs) < hrsPerMonth )
			{
				totalEmpHrs+=empHrs;
			}
			else
				break;
			dailyWage = (empHrs * wagePerHr);
		}
		totalSalary = (totalEmpHrs * wagePerHr);
		System.out.println("Total salary for employees of "+ company +" is = Rs." + totalSalary);
	}


   public static void main(String[] args)
   {
      Employee emp[] = new Empwage[5];
		emp[0] = new Empwage();
		emp[1] = new Empwage();
		System.out.println("Details for Company ");
		emp[0].getEmpWage(9, 60, 22, 180, "Decathlon");
		emp[1].getEmpWage(6, 90, 26, 200, "DMart" );
   }

}


