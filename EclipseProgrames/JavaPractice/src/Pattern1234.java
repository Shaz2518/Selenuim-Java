/* 1 2 3 4
   1 2 3
 * 1 2 
 * 1
 */
public class Pattern1234 {

	public static void main(String[] args) {
		for (int row = 4; row>=0; row--)
		{
			for(int col =1; col<=row; col++)
			{
				System.out.print(col + " ");
				
			}
			System.out.println(" ");
		}
	}

}
