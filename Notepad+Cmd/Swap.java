import java.lang.*;
import java.util.Scanner;
class Swap
{ 	
	public static void main(String args[])
	{
		int a, b;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter value for a and b");
		a = scr.nextInt();
		b = scr.nextInt();
		System.out.println("Before swap a and b: " + a + " " + b);
		a= a^b;
		b= a^b;
		a= a^b;
		System.out.println("After swap a and b: " + a + " " + b);
	}
}
	
