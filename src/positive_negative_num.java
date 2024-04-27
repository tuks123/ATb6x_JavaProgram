import java.util.Scanner;

public class positive_negative_num {
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is Positive");
		}else
			if(num<0)
			{
				System.out.println("Number is Negative");
			}else
			{
				System.out.println("Number is Zero");
			}
		sc.close();
	}

}
