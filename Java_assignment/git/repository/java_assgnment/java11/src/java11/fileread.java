package java11;
import java.util.StringTokenizer;
import java.io.*;
public class fileread {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fr=new FileReader("C:\\Users\\avnish kumar\\Desktop\\sol 1.txt");
      BufferedReader br = new BufferedReader(fr);
      String st=br.readLine();
      int c=0;
      try {
      while((st=br.readLine())!=null)
      {
    	 
    	  StringTokenizer stn=new StringTokenizer(st);
    	  c++;
    	  String roll =stn.nextToken();
    	  String name=stn.nextToken();
    	  System.out.println(roll+" "+name);
    	  
      }
      System.out.print("total student "+c);
      }
      catch (Exception e)
      {
    	  System.out.print(e);
      }
	}

}
