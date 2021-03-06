import java.io.*;
import java.util.*;
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
	int i=0;
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
		int[] dailywage=new int[daysPerMonth+1];
		int[] totalsalary = new int[daysPerMonth+1];
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
			totalSalary+=dailyWage;
			dailywage[i] = dailyWage;
			totalsalary[i] = totalSalary;
			i++;
		}
		System.out.println("Days \t Dailywage \t TotalSalary ");
		System.out.println();
		int i=1;
		for(int j=0; j< dailywage.length; j++)
		{
			if( i > daysPerMonth)
				break;
			System.out.println("Day "+i+"\t  "+dailywage[j]+"\t  \t   "+totalsalary[j]);
			i+=1;
		}
	}


	public static void main(String[] args)
	{
		Employee emp = new Empwage();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Company you would like access the wage for:[DMart, Decathlon, Reliance]");
		String company = scanner.next();
		if( company.equals("DMart"))
			emp.getEmpWage(9, 60, 26, 180, "Dmart");
		else if( company.equals("Decathlon"))
			emp.getEmpWage(7, 40, 20, 140, "Decathlon");
		else
			emp.getEmpWage(12, 30, 22, 240, "Reliance");

	}

}



