package stringexmple;
public class StringExmple {
    public static void main(String[] args) {
        // To check if its gmail ID == Mthod one
        
        String str = "programmer@gmail.com";
        System.out.println(str.matches(".*@gmail.*"));
        
        String username = str.substring(0, 10);
        System.out.println(username);
        
        String pswd = str.substring(10, 20);
        System.out.println(pswd);
        
        
         // To check if its gmail ID and subtring == Mthod 2
         
         int ind = str.indexOf('@');
         System.out.println(ind);
         
        String user = str.substring(0, ind);
        System.out.println(user);
        
        String pass = str.substring(ind+1,str.length());
        System.out.println(pass);
        
        int dot = str.indexOf(".");
        System.out.println(dot);
        
        String mail = str.substring(ind+1 , dot);
        System.out.println(mail);
        
        System.out.println(mail.equals("gmail"));
        System.out.println(mail.compareToIgnoreCase("gmail"));
        
         
         
        
        
    }
    
}
