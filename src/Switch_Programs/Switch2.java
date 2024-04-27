package Switch_Programs;
import java.util.Scanner;

public class Switch2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2");
		int num2=sc.nextInt();
		System.out.println("Which Operation do you want to perform? +,*,/ ,%, -");
		char ch=sc.next().charAt(0);
		int result;
		switch(ch)
		{
		 	case '+':
		 		result=num1+num2;
		 		System.out.println("Result of the Operation is: " +result);
		 		break;
		 	case '-':
		 		result=num1-num2;
		 		System.out.println("Result of the Operation is: " +result);
		 		break;
		 	case '*':
		 		result=num1*num2;
		 		System.out.println("Result of the Operation is: " +result);
		 		break;
		 	case '/':
		 		result=num1/num2;
		 		System.out.println("Result of the Operation is: " +result);
		 		break;
		 	case '%':
		 		result=num1%num2;
		 		System.out.println("Result of the Operation is: " +result);
		 		break;
		 	default:
		 			System.out.println("It is not a valid Operation to perform");
		}
		
		
	}

}
