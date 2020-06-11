public class Empwage
{

	double empCheck=0.0;
	int dailyWageFull=0;
	int dailyWagePart=0;
	int jobType = 0;

	private static final int IS_PRESENT = 1;
	private static final int WAGE_PER_HOUR=20;
	private static final int HOURS_PER_DAY_FULL=8;
	private static final int HOURS_PER_DAY_PART=4;

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
					break;
				case 0:
					System.out.println("Employee works Part Time");
					dailyWagePart = (WAGE_PER_HOUR * HOURS_PER_DAY_PART);
					System.out.println("Daily wage would be = Rs." + dailyWagePart);
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
