package gradescal;
import java.util.Scanner;
public class GradesCal {
    public static void main(String[] args) {
        int sub1, sub2, sub3;
        System.out.println("Enter marks of 3 subjects");
        Scanner scr = new Scanner(System.in);
        sub1 = scr.nextInt();
        sub2 = scr.nextInt();
        sub3 = scr.nextInt();
        float avg = (float)(sub1+sub2+sub3)/3;
        if(avg >= 70)
        {
            System.out.println("A Grade");
        }
        else if(avg >=60 && avg <70)
        {
            System.out.println("B Grade");
        }
        else if(avg >=50 && avg <60)
        {
            System.out.println("C Grade");
        }
        else if(avg >=40 && avg <50 )
        {
            System.out.println("D Grade");
        }
        else
        {
            System.out.println("F Grade");
        }
     
    }
    
}
