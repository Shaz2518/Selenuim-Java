import java.lang.*;
import java.util.Scanner;
class Merge
{
	public static void main(String args[])
	{
		byte a=9, b=12;
		byte c;
		c= (byte)(c|a);
		b= (byte)(b>>4);
		c= (byte)(c|b);
		System.out.println("Values of a b and c are: " + a + " " + b + " " + c);
	}
}
