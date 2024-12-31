package stringmethodsdemo;
public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello";
        
        // to get length of a string
        int len = str.length();
        System.out.println("Length of String is: " + len);
        
        // to change string to Upper Case
        String upper = str.toUpperCase();
        System.out.println("String in Upper Case: " + upper);
        
        //to change string to lower case
        String lower = str.toLowerCase();
        System.out.println("String in lower Case: " + lower);
        
        //To trin white spaces from String
        String str1 = "      Hello    ";
        String trim_space = str1.trim();
        System.out.println("String before nd after trim: " + str1 + " " + trim_space);
        
        //To replace a character in String
        String char_replace = str.replace('l','z');
        System.out.println("String after replace: " + char_replace);
        
        // to make substring
        String sub_str = str.substring(2);
        System.out.println("Subtring is: " + sub_str);
        
        // Substring in range
        String sub_range = str.substring(2,4);
        System.out.println("Subtring in range is: " + sub_range);
       
        // to check starting and ending of String
        String name = "Mrs. Shaziya Shaikh";
        System.out.println("Starting: " + name.startsWith("Mrs"));
        System.out.println("Ending: " + name.endsWith("kh"));
        System.out.println("Character at: " + name.charAt(5));
        System.out.println("Index of: " + name.indexOf("z"));
        System.out.println("Last Index: " + name.lastIndexOf("Shaikh"));
        
       //To check if string is equal, compare and change to String
       String str1_c = "Hello";
       String str2_c = "Hell";
       System.out.println(str1_c.equals(str2_c));
       System.out.println(str1_c.equalsIgnoreCase(str2_c));
       System.out.println(str1_c.compareTo(str2_c));
       
      int number =98;
      String str_val = String.valueOf(number);
      System.out.println(str_val);
      
            
    }
    
}
