package Switch_Programs;

import java.util.Scanner;

public class Switch5 {
	public static void main(String args[])
	{
		// marks 90-100 -> A
		//80-89  -> B
		//70-79 -> C
		//60-69 -> D
		//50-59 -> Fail
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yours Marks");
		int marks=sc.nextInt();
		marks=marks/10;
		switch(marks)
		{
			case 9:
				System.out.println("Your Grade is A ");
				break;
			case 8:
				System.out.println("Your Grade is B ");
				break;
			case 7:
				System.out.println("Your Grade is C ");
				break;
			case 6:
				System.out.println("Your Grade is D ");
				break;
			case 5:
				System.out.println("Your are Fail ");
				break;
			default: System.out.println("Grade Not Found");
		}
	}

}
