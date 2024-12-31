/* 3
 * 6 9
 * 12 15 18
 * 21 24 27 30
 */
public class Pattern4 {

	public static void main(String[] args) {
		int incrmnt=3;
		for(int row=1; row<5; row++)
		{
			for (int col=1; col<=row ; col++)
			{
				System.out.print(incrmnt + " ");
				System.out.print("\t");
				incrmnt= incrmnt+3;
			}
			System.out.println(" ");
		}
	}

}
