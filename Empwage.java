public class Empwage
{

	double empCheck=0.0;
	private static final int IS_FULL_TIME = 1;

   public void getWelcomeMessage()
   {
      System.out.println("Welcome To Employee Wage Computation Process");
   }

	public void getAttendance()
	{
		empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
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
