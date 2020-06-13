public class Empwage
{

	double empCheck=0.0;
	int jobType = 0;
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	int totalSalary = 0;
	int dailyWage = 0;
	int daysPerMonth = 0;
	int hrsPerMonth = 0;
	int wagePerHr = 0;

	private static final int IS_PRESENT = 1;
	private static final int WAGE_PER_HOUR=20;
	private static final int HOURS_PER_DAY_FULL=8;
	private static final int HOURS_PER_DAY_PART=4;
	private static final int DAYS_PER_MONTH = 20;
	private static final int HOURS_PER_MONTH = 100;

	public void getWelcomeMessage()
	{
		System.out.println("Welcome To Employee Wage Computation Process");
	}

	public int getEmpHrs()
	{
		empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");
			jobType = (int)Math.floor(Math.random() * 10) % 2;
			switch(jobType){
				case 1:
					empHrs=8;
					break;
				case 0:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
		}

		else
			System.out.println("Employee is Absent");
		return empHrs;
	}

	public void getEmpSalary(String company, int daysPerMonth, int hrsPerMonth, int wagePerHr, int empHrs)
	{
		this.empHrs=empHrs;
		this.wagePerHr=wagePerHr;
		this.daysPerMonth=daysPerMonth;
		this.hrsPerMonth = hrsPerMonth;
		this.company=company;
		while ( totalWorkingDays <= daysPerMonth && totalEmpHrs <= hrsPerMonth )
		{
			totalWorkingDays+=1;
			if ( (totalEmpHrs + empHrs) < hrsPerMonth )
			{
				totalEmpHrs+=empHrs;
			}
			else
			{
				if((hrsPerMonth - totalEmpHrs) == 4)
					totalEmpHrs+=4;
				break;
			}
			dailyWage = (empHrs * wagePerHr);
		}
		System.out.println("Total Working Hours = " + totalEmpHrs );
		totalSalary = (totalEmpHrs * wagePerHr);
		System.out.println("Total salary for employees of "+ company +" is = Rs." + totalSalary);
	}



   public static void main(String[] args)
   {
      Empwage emp = new Empwage();
      emp.getWelcomeMessage();
		int temp = emp.getEmpHrs();
		emp.getEmpSalary("DMart", 26, 6, 10, temp);
		emp.getEmpSalary("Reliance fresh", 20, 9, 18, temp);
   }

}

