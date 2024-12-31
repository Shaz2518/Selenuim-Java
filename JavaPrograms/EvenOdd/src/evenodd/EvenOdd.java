package evenodd;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Number is Even: " + " " + num);
        }
        else
        {
            System.out.println("Number is Odd: " + " " + num);
        }
    }
    
}
