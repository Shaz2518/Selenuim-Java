/* 1 2 3 4
 * 5 6 7
 * 8 9
 * 10
 */



public class Pattern1 {

	public static void main(String[] args) {
		int incrmnt =1;
		for(int row=0; row<4; row++)
		{
			for(int col=1; col<=4-row; col++)
			{
				System.out.print(incrmnt + " ");
				incrmnt++;
			}
			System.out.println(" ");
			
		}

	}

}
