import java.lang.*;
import java.util.*;
class Keybread
{ 	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1, num2, sum;
		num1=s.nextInt();
		num2=s.nextInt();
		sum= num1 +num2;
		System.out.println("The sum is:" + sum);
	}
}