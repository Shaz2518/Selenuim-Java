package websiteprtocol;
import java.util.Scanner;
public class WebsitePrtocol {
    public static void main(String[] args) {
        //String web = "https://www/google.com";
        
        String web;
        System.out.println("Enter website URL");
        Scanner scr = new Scanner(System.in);
        web = scr.nextLine();
        int ind = web.indexOf(':');
        String str = web.substring(0, ind);
        System.out.println(str);
        if (str.equals("http"))
        {
            System.out.println("Hyper Text Markup Language");
        }
        else if (str.equals("https"))
        {
            System.out.println("Hyper Text Markup Lanuguage Secure");
        }
        else if(str.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else
        {
            System.out.println("Invalid Protocol");
        }
        
        int lstind = web.lastIndexOf('.');
        String last = web.substring(lstind+1, web.length());
        System.out.println(last);
       
        if(last.equals("com"))
        {
            System.out.println("Commercial Website");
        }
        else if(last.equals("org"))
        {
            System.out.println("Organizational Website" );
        }
        else if(last.equals("net"))
        {
            System.out.println("Network Website");
        }
        else
        {
            System.out.println("Invalid domain");
        }
            
    }
    
}
