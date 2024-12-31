
public class Swapping_Demo {
//Swapping using temp variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 6;
		int temp =0;
		System.out.println("*******Swapping using temp variable*******");
		System.out.println("Before Swapping:" + a + " " + b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping:" + a + " "+ b);
		
//Swapping without temp variable
		int num1 = 10;
		int num2 = 5;
		System.out.println("*******Swapping without temp variable*******");
		System.out.println("Before Swapping:" + num1 + " " + num2);
		num1 = num1 + num2; //a=13
		num2 = num1 - num2; //b=7
		num1 = num1 - num2; //a=6
		System.out.println("After Swapping:" + num1 + " "+ num2);
		
		
		

}
}
