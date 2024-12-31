import java.lang.*;
class DataSizeRange
{
	public static void main(String args[])
	{
		System.out.println("Min Int Size: " + Integer.MIN_VALUE);
		System.out.println("Max Int Size: " + Integer.MAX_VALUE);
		System.out.println("Byte Int Size: " + Integer.BYTES);
		
		System.out.println("Min Float Size: " + Float.MIN_VALUE);
		System.out.println("Max Float Size: " + Float.MAX_VALUE);
		System.out.println("Byte Float Size: " + Float.BYTES);

		System.out.println("Min Byte Size: " + Byte.MIN_VALUE);
		System.out.println("Max Byte Size: " + Byte.MAX_VALUE);
		System.out.println("Byte Bytes Size: " + Byte.BYTES);
	}
}