import java.lang.*;
import java.util.Scanner;
class Quadratic
{
	public static void main(String args[])
	{
		int a, b, c;
		double r1, r2;
		System.out.println("Enter 3 numbers");
		Scanner scr = new Scanner(System.in);
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
	
		r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

		System.out.println("Roots are: " + r1 + " " + r2);
	}
}