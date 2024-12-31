public class MultiDimensonalArray_Demo {

	public static void main(String[] args) {
		int arr[][] = {{2,4,15},{9, 0, 1},{6, 3, 4}};
		int min = arr[0][0];
		int mincol=0;
		int max =arr[0][mincol];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				if (arr[i][j] < min)
				{
					min = arr[i][j];
					mincol =j;
				}
			}
		}
		int k = 0;
		while(k<3)
		{		
			if(arr[k][mincol]>max)
			{
				max = arr[k][mincol];
			}
			k++;
		}
		System.out.println("Minimum number is:" + min);
		System.out.println("Minimum Number Column:" + mincol);
		System.out.println("Maximum Number in column" + mincol + ": " + max );
	}

}
