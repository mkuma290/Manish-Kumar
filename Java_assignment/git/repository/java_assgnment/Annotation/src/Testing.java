
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)
@interface test {
	int value();
}
class Hello
{
	@test(value=1)
	public void abc()
	{
		System.out.print("manish");
	}
}
public class Testing {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
    Hello h=new Hello();
    Method m=h.getClass().getMethod("abc");
  test t=  m.getAnnotation(test.class);
  System.out.print(t.value());
	}

}

