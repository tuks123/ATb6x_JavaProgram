
public class HelloWorld {
	public static void main(String args[])
	{
		/*System.out.println("Hello World..");
		System.out.println(2+2);
		System.out.println(10-2);
		System.out.println(9*7);
		System.out.println(90/5);
		byte b= 127;*/
		
		
		String name="Tukaram";
		String name1="Tukaram";
		String name2=new String("Tukaram");
		String name3=new String("Tukaram");
		
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		System.out.println(name==name2);
		System.out.println(name2==name3);
		System.out.println(name2.equals(name3));
	}
	

}
