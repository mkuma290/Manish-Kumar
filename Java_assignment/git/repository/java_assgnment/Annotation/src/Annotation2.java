
import java.lang.annotation.*;
import java.lang.reflect.*;  
//@Target(ElementType.METHOD)
@Target(ElementType.METHOD)
//@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int ID();
	String name();
	String date();
	String time();
}
class hello
{
	@info(ID=1,name="manish",date="6-NOV-21",time="12:39PM")
	//@info(ID=1,name="manis",date="7-NOV-21",time="12:39PM")
	public void xyz()
	{
		System.out.print("manish");
	}
}
public class Annotation2  {
   
	
	public static void main(String[] args) throws Exception
	{
	
         hello h=new hello();
         Method m=h.getClass().getMethod("xyz");
         info i =m.getAnnotation(info.class);
         System.out.print(i.ID()+" "+i.name()+" "+ i.date()+" "+ i.time());
	}

}
