
public class PalindromString {

	public static void main(String[] args) {
		String str = "Shaziya";
		str = str.toLowerCase();
		String temp ="";
		for(int i= str.length()-1; i>=0; i--)
		{
			temp = temp + str.charAt(i);
		}
		System.out.println("Reverse String is: " + temp);
		if(str.equals(temp))
		{
			System.out.println("It is a palindrom");
		}
		else
		{
			System.out.println("It is not a palindrom");
		}
	}

}
