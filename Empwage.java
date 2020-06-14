class Empwage
{

	double empCheck=0.0;
	int jobType = 0;
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	int totalSalary = 0;
	int dailyWage = 0;

	private static final int IS_PRESENT = 1;

	public void getWelcomeMessage()
	{
		System.out.println("Welcome To Employee Wage Computation Process");
	}

	public int getEmpHrs()
	{
		empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_PRESENT)
		{
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

		return empHrs;
	}

	public void getEmpWageForDmart()
	{
		int empHrs = 0;
		int wagePerHr=13;
		int daysPerMonth= 26;
		int hrsPerMonth = 80;
		String company= "Dmart";
		while ( totalWorkingDays <= daysPerMonth && totalEmpHrs <= hrsPerMonth )
		{
			empHrs = getEmpHrs();
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

	public void getEmpWageForReliance()
   {
      int empHrs= 0;
      int wagePerHr = 10;
      int daysPerMonth= 20;
      int hrsPerMonth = 110;
      String company= "Reliance";
      while ( totalWorkingDays <= daysPerMonth && totalEmpHrs <= hrsPerMonth )
      {
			empHrs=getEmpHrs();
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
      Empwage emp[] = new Empwage[5];
		emp[0] = new Empwage();
		emp[1] = new Empwage();
		Empwage employee = new Empwage();
		int temp = employee.getEmpHrs();
		System.out.println("Details for Dmart: ");
		emp[0].getEmpWageForDmart();
		System.out.println("Details for Reliance: ");
		emp[1].getEmpWageForReliance();
   }

}


