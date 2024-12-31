import java.text.SimpleDateFormat;
import java.util.*;
public class DateCalender_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date d = new Date();
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		//System.out.println()
		
	}

}
