package youngold_demo;
import java.util.Scanner;
public class YoungOld_Demo {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner scr = new Scanner(System.in);
        age = scr.nextInt();
        if(age>=14 && age<=55)
        {
            System.out.println("You are YOUNG");
        }
        else if (age<14)
        {
            System.out.println("You are CHILD");
        }
        else
        {
            System.out.println("You are OLD");
        }
    }
    
}
