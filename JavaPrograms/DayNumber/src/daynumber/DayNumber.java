package daynumber;
import java.util.Scanner;
public class DayNumber {
   public static void main(String[] args) {
       int day;
       System.out.println("Enter a day number");
       Scanner scr = new Scanner(System.in);
       day = scr.nextInt();
       if(day==1)
       {
           System.out.println("Its Monday");
       }
       else if(day==2)
       {
           System.out.println("Its Tuesday");
       }
       else if(day==3)
       {
           System.out.println("Its Wednesday");
       }
       else if(day==4)
       {
           System.out.println("Its Thursday");
       }
       else if(day==5)
       {
           System.out.println("Its Friday");
       }
       else if(day==6)
       {
           System.out.println("Its Saturday");
       }
       else if(day==7)
       {
           System.out.println("Its Sunday");
       }
       else
       {
           System.out.println("Invalid Day Number");
       }
          
 
}
    
}
