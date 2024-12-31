public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1434114341;
		int rem, sum=0;
		int temp = num;
		while(num > 0)
		{
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
			
		}
		System.out.println(sum);
		if(sum == temp)
			System.out.println("Its a Palindrom");
		else
		System.out.println("Its not a palindrom");

}
}
