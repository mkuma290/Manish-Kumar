import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
class abcd {
int news_id;
String posted;
String comment_byuser;
int comment;
	public abcd(int news_id,String posted,String comment_byuser,int comment)
	{
		this.news_id=news_id;
		this.posted=posted;
		this.comment_byuser=comment_byuser;
		this.comment=comment;
	}
	public int getnewsid()
	{
		return news_id;
	}
	public void setnewsid(int news_id)
	{
		this.news_id=news_id;
	}
	public String getposted()
	{
		return posted;
	}
	public void setposted(String posted)
	{
		this.posted=posted;
	}
	public int getcomment()
	{
		return comment;
	}
	public void setcomment(int comment)
	{
		this.comment=comment;
	}
	 @Override
	    public String toString() {
	        return "abcd{" +
	                "comment='" + comment + '\'' +
	                ", news_id=" + news_id +
	                '}';
	    }
	
}
public class News
{
	public static void main(String args[])
	{
		ArrayList<abcd> list=new ArrayList<abcd>();
		list.add(new abcd(1,"post1","comment1",5));
		list.add(new abcd(2,"post2","comment2",10));
		list.add(new abcd(3,"post3","comment3",34));
		list.add(new abcd(4,"post4","comment4",12));
		list.add(new abcd(5,"post5","comment5",11));
      Comparator<abcd> com=Comparator.comparing( abcd::getcomment );
     abcd minObject = list.stream().min(com).get();
      abcd maxObject = list.stream().max(com).get();
      System.out.println("minObject = " + minObject);
      System.out.println("maxObject = " + maxObject);
      System.out.println("------------------");
	}
}
