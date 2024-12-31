package radixofnumber;
import java.util.Scanner;
public class RadixofNumber {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter the string");
        Scanner scr = new Scanner(System.in);
        name = scr.nextLine();
        if(name.matches("[01]+"))
        {
            System.out.println("Number is Binary: Redix 2");
        }
        else if(name.matches("[0-7]+"))
        {
            System.out.println("Number is Octal: Redix 8");
        }
        else if(name.matches("[0-9]+"))
        {
            System.out.println("Number is Decimal: Redix 10");
        }
        else if(name.matches("[0-9A-F]+"))
        {
            System.out.println("Number is Hexa-Decimal: Redix 16");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
    
}
