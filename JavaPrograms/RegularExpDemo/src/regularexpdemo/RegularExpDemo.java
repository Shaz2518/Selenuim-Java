package regularexpdemo;
public class RegularExpDemo {
    public static void main(String[] args) {
        String str = "a";
        String str1 = "9";
        String str2 ="&";
        String str3 = " ";
        String str4 = "abc";
        String str5 = "bx";
        

        // To check single character
        
        System.out.println(str.matches("."));
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        
        // To check single character
        System.out.println(str.matches("[xyz]"));
        
        //To check range of mu;tiple symbol
        System.out.println(str5.matches("[xyz][abc]"));
        
        //To check expect given sympol
        System.out.println(str4.matches("[^abc]"));
        
        //to check digits
         System.out.println(str1.matches("\\d"));
         System.out.println(str1.matches("\\D"));
         
         //to check space
         System.out.println(str3.matches("\\s"));
         System.out.println(str3.matches("\\S"));
         
         //To check wither alpha or digit
         System.out.println(str1.matches("\\w"));
         System.out.println(str1.matches("\\W"));
         
         System.out.println(str2.matches("\\w"));
         System.out.println(str2.matches("\\W"));
         
        
       
       
    }
    
}
