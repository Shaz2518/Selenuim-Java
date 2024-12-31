package regularexpques;
public class RegularExpQues {
   public static void main(String[] args) {
       
       //To check if its binary number       
       int b = 10110001;
       String str = String.valueOf(b);
       System.out.println(str.matches("[01]*"));
       
       //To check if its Hexa-Decimal [0-9 A-F]
       
       String str1 = "4657A";
       System.out.println(str1.matches("[0-9 A-F]+"));
       
        // To check date expression dd/mm//yyyy
        String dt = "25/02/1997";
        System.out.println(dt.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
        
        //To remove special character
        
        String str_c = "a!B@c#1$2%3";
        System.out.println(str_c.replaceAll("[^a-zA-Z0-9]", ""));
        
        //To remove extra space
        String str_s = "   abc  de   eghr";
        System.out.println(str_s.replaceAll("\\s+", "").trim());
        
        //To count number of words.
        String str_n = "abc gh ashjwhd ashjkqhdkjhd dehwdqd";
        String word[]= str_n.split("\\s");
        
        System.out.println(word.length);
        
      
       
       
   }
    
}
