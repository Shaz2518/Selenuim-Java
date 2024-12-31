import java.lang.*;
class stringMethodsDemo
{
	public static void main(String args[])
	{
		String str = "Hello";
		
		int len = str.length();
		System.out.println("Length of String is: " + len);

		String upper = str.toUpperCase();
		System.out.println("Upper Case String: " + upper);

		String lower = str.toLowerCase();
		System.out.println("Lower Case String: " + lower);

		String replace_str = str.replace('l','z');
		System.out.println("Replaced String: " + replace_str);

		String sub_str = str.substring(3);
		System.out.println("Substring: " + sub_str);

		String sub_range = str.substring(2,5);
		System.out.println("Sbtring in range: " + sub_range);

		String str_space = "       Hell o    ";
		String str_trim = str.trim();
		System.out.println("String trim: " + str_trim);
	}
} 
		
		