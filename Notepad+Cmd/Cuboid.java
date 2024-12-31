import java.lang.*;
import java.util.Scanner;
class Cuboid
{
	public static void main(String args[])
	{	
		int length, breadth, height;
		int area, volume;

		System.out.println("Enter length, breadth, height of cuboid");
		Scanner scr = new Scanner(System.in);

		length = scr.nextInt();
		breadth = scr.nextInt();
		height = scr. nextInt();

		area = 2 * (length*breadth + breadth*height + height*length);
		volume = length * breadth * height;

		System.out.println("Area of cuboid is: "+ area);
		System.out.println("Volume of cuboid is: " + volume);
	}
}