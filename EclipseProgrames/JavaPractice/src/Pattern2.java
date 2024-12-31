/* 1 
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */



public class Pattern2 {

	public static void main(String[] args) {
		int incrmnt=1;
		for(int row=1;row<5;row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(incrmnt + " ");
				//System.out.print("\t");			
				incrmnt++;
			}
			System.out.println(" ");
		}
		
	}

}
