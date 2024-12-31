package leapyear;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter year");
        Scanner scr = new Scanner(System.in);
        year = scr.nextInt();
        if (year %4 ==0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("Its a leap year");
                }
                else
                {
                   System.out.println("Its not a leap year");
                }      
                
            }
            else
            {
                System.out.println("It is a leap year");
            }
        }
        else
        {
            System.out.println("Its not a leap year");
        }
    }
    
}
