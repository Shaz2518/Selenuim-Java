import java.util.ArrayList;

public class OccurenceOfLetter {
	public static void main (String[] args)
	{

		ArrayList<String> names = new ArrayList<String>();
		names.add("Shaziya");
		names.add("Shamiya");
		names.add("Neil");
		names.add("Saniya");
		names.add("Voldemort");
		int count = 0;
		for(int i = 0; i<names.size(); i++)
		{
			String str = names.get(i);
			if(str.startsWith("S"))
					
				count++;
			
		}
		System.out.println(count);
		
		
	}
}
			

