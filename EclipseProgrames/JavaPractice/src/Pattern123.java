/* 1
   1 2
   1 2 3
   1 2 3 4
 */
public class Pattern123 {
	public static void main(String[] args) {
		
		for(int row = 1; row <=4; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(col);
				System.out.print("\t");
				
			}
			System.out.println(" ");
		}
	}
}