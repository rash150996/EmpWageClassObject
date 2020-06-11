public class Empwage
{

	double empCheck=0.0;
	int dailyWageFull=0;
	int dailyWagePart=0;
	int jobType = 0;
	int monthlyWageFull=0;
	int monthlyWagePart=0;

	private static final int IS_PRESENT = 1;
	private static final int WAGE_PER_HOUR=20;
	private static final int HOURS_PER_DAY_FULL=8;
	private static final int HOURS_PER_DAY_PART=4;
	private static final int DAYS_PER_MONTH = 20;

   public void getWelcomeMessage()
   {
      System.out.println("Welcome To Employee Wage Computation Process");
   }

	public void getAttendance()
	{
		empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");
			jobType = (int)Math.floor(Math.random() * 10) % 2;
			switch(jobType){
				case 1:
					System.out.println("Employee works Full Time");
					dailyWageFull = (WAGE_PER_HOUR * HOURS_PER_DAY_FULL);
					System.out.println("Daily wage would be = Rs." + dailyWageFull);
					monthlyWageFull = (dailyWageFull * DAYS_PER_MONTH );
					System.out.println("Monthly wage would be = Rs." + monthlyWageFull );
					break;
				case 0:
					System.out.println("Employee works Part Time");
					dailyWagePart = (WAGE_PER_HOUR * HOURS_PER_DAY_PART);
					System.out.println("Daily wage would be = Rs." + dailyWagePart);
					monthlyWagePart = (dailyWagePart * DAYS_PER_MONTH );
					System.out.println("Monthly wage would be = Rs." + monthlyWagePart );
					break;
				default:
					System.out.println("Invalid");
			}
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
