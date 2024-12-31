package relationops_demo;

public class RelationOps_Demo {

    public static void main(String[] args) {
        // To check Positive or Negative
        int a = -13;
        if (a>=0)
        {
            System.out.println("a is Positive");
        }
        else
        {
            System.out.println("a is Negative");
        }
         
        //To check greatest of 3
        int p=5, q=15, r=10;
        if(p>q && p>r)
        {
            System.out.println("P is greater" + p);
        }
        else if(q>r)
        {
            System.out.println("Q is greatest" + q);
        }
        else
        {
            System.out.println("R is greatest" + r);
        }
            
    }
    
}
