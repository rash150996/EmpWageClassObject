public class Empwage
{

	double empCheck=0.0;
	int dailyWage=0;

	private static final int IS_FULL_TIME = 1;
	private static final int WAGE_PER_HOUR=20;
	private static final int HOURS_PER_DAY=8;

   public void getWelcomeMessage()
   {
      System.out.println("Welcome To Employee Wage Computation Process");
   }

	public void getAttendance()
	{
		empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee is Present");
			dailyWage = (WAGE_PER_HOUR * HOURS_PER_DAY);
			System.out.println("Daily wage would be = Rs." + dailyWage);
		}

		else
			System.out.println("Employee is Absent");
	}

   public static void main(String[] args)
   {
      Empwage emp = new Empwage();
      emp.getWelcomeMessage();
		emp.getAttendance();
   }

}
