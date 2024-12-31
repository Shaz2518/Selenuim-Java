import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 5, 5, 4, 6, 9, 9, 4};
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i =0; i<arr.length; i++)
		{
			int count = 0;
			if(!arrList.contains(arr[i]))
			{
				arrList.add(arr[i]);
				count++;
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]== arr[j])
					{
						count++;
					}
				}
				System.out.println("Occurent of " + arr[i] + "-" + count);
				/*if(count == 1)
				{
					System.out.println("Uniqe number is: " + arr[i]);
				}*/
				
			}
		}
		
	
		

	}

}
