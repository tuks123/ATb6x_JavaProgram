import java.util.Scanner;

public class Leap_year {
	public static void main(String args[])
	{
		System.out.println("Enter a Year: ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==200)
		{
			System.out.println("Year is leap ");
		}else
		{
			System.out.println("Year is not leap ");
		}
	}

}
