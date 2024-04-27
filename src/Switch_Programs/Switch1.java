package Switch_Programs;
import java.util.Scanner;

public class Switch1 {
	public static void main(String args[])
	{
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
	    switch(ch)
	    {
	    	case 'a':
	    		System.out.println("Its a Wovel");
	    		break;
	    	case 'e':
	    		System.out.println("Its a Wovel");
	    		break;
	    	case 'i':
	    		System.out.println("Its a Wovel");
	    		break;
	    	case 'o':
	    		System.out.println("Its a Wovel");
	    		break;
	    	case 'u':
	    		System.out.println("Its a Wovel");
	    		break;
	    	default:
	    		System.out.println("Its not Vowel");
	    		break;
	    		
	    }
		
	}

}
