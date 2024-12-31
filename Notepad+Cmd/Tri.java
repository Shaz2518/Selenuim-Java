import java.lang.*;
import java.util.Scanner;
class Tri
{
	public static void main(String args[])
	{	
		int side1, side2, side3;
		float s;
		double area;
		System.out.println("Enter 3 sides");
		Scanner scr = new Scanner(System.in);
		side1 = scr.nextInt();
		side2 = scr.nextInt();
		side3 = scr.nextInt();
		s = (side1 + side2 + side3)/2f;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of Traiangle is: " + area);
	}
}