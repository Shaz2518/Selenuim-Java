package menuswitch;
import java.util.Scanner;
public class MenuSwitch {
    public static void main(String[] args) {
        System.out.println("Options");
        System.out.println("========");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        
        System.out.println("Enter 2 numbers");
        Scanner scr = new Scanner(System.in);
        int num1, num2;
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        scr.nextLine();
        System.out.println("Enter your Option:");
        String options;
        options = scr.nextLine();
        //scr.nextLine();
        
        switch(options)
        {
            case "Add": System.out.println("Addition of 2 numbers:" + " " + (num1+num2));
                        break;
            case "Sub": System.out.println("Subtraction 2 numbers:" + " " + (num1-num2));
                        break;
            case "Mul": System.out.println("Multiplication 2 numbers:" + " " + (num1*num2));
                        break;
            case "Div": System.out.println("Division 2 numbers:" + " " + (num1/num2));
                        break;
            default: System.out.println("Enter valid option" );
                       
                     
        }
        
                
        
    }
    
}
