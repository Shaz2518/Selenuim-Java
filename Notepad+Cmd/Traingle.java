import java.lang.*;
import java.util.*;
class Traingle
{
	public static void main(String args[])
	{
		float base, height, area;
		System.out.println("Enter base and height of a triangle");
		Scanner scr= new Scanner(System.in);
		base=scr.nextFloat();
		height=scr.nextFloat();
		area= (base*height)/2;
		System.out.println("Area of triangle is:" + area);
	}
}