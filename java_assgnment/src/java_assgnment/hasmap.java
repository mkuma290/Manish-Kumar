package java_assgnment;
import java.util.Calendar;
import java.util.HashMap;

public class hasmap {

	public static void main(String[] args)
	{
		//Date date = new Date();
		Calendar cal = Calendar.getInstance();
	HashMap<String,String> h =new HashMap<String,String>();
	HashMap<String,Integer> h1 =new HashMap<String,Integer>();
      h.put("1", "2");
      h.put("manish","kumar");
      System.out.println(h);
      h1.put("year", cal.get(Calendar.YEAR));
      h1.put("month", cal.get(Calendar.MONTH));
      h1.put("Day", cal.get(Calendar.DAY_OF_MONTH));
      System.out.print(h1);
	}

}
