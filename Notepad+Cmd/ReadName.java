import java.lang.*;
import java.util.*;
class ReadName
{ 	
	public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Please enter your name");
	String name;
	name = s.nextLine();
	System.out.println("Welcome to java learning " + name);
	}
}