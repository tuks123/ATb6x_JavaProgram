package Switch_Programs;

import java.util.Scanner;

public class Switch4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Browser name that you want to Open");
		String Bname=sc.next();
		Bname=Bname.toLowerCase();
		switch(Bname)
		{
			case "chrome":
				System.out.println("Chrome browser is Open");
				break;
			case "firefox":
				System.out.println("Firefox browser is open");
				break;
			case "edge":
				System.out.println("Edge browser is Open");
				break;
			default:
				System.out.println("Invalid Browser name");
		}
	}
}
