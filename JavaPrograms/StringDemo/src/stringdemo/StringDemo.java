package stringdemo;
public class StringDemo {

    public static void main(String[] args) {
      String str1 = "Java Program";
      String str2 = new String("Java");
      
      char c[] = {'H', 'e', 'l', 'l', 'o'};
      String str3 = new String(c);
      
      byte b[] = { 65,66,67,68,69};
      String str4 = new String(b);
      
      System.out.println("String str1: " + str1);
      System.out.println("String str2: " + str2);
      System.out.println("String str3: " + str3);
      System.out.println("String str4: " + str4);
    }
    
}
