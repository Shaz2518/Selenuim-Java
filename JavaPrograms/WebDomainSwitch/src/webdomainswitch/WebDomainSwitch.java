package webdomainswitch;
import java.util.Scanner;
public class WebDomainSwitch {
    public static void main(String[] args) {
           String str;
           System.out.println("Enter the website name");
           Scanner scr = new Scanner(System.in);
           str = scr.nextLine();
           int ind = str.indexOf('.');
           String indx = str.substring(ind+1 , str.length());
           switch(indx)
           {
               case "com": System.out.println("Commercial");
                        break;
                case "gov": System.out.println("Government");
                        break;
               case "net": System.out.println("Network");
                        break;
               case "org": System.out.println("Organizational");
                        break;
               default: System.out.println("Invalid Domain");
                                    
                        
           }
    }
    
}
