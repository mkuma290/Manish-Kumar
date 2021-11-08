import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
class abc
{
	String name;
	int calories;
	int price;
	String color;
	public abc(String name,int calories,int price,String color)
	{
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public int getCalories()
	{
		return calories;
	}
	public void setCalories(int calories)
	{
		this.calories=calories;
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	 @Override
	    public String toString() {
	        return "abc{" +
	                "name='" + name + '\'' +
	                ", calories=" + calories +
	                '}';
	    }
}




public class Fruit {

	public static void main(String[] args) {
		ArrayList<abc> list = new ArrayList<abc>();
   list.add(new abc("mango",20,10,"yellow"));
   list.add(new abc("Apple",400,10,"Red"));
   list.add(new abc("Leachi",200,20,"Red"));
   list.add(new abc("Coconut",300,5,"Red"));
   list.add(new abc("grapes",40,10,"Green"));
   list.add(new abc("Guava",400,10,"Green"));
   
   List<abc> l=list.stream().filter(abc->abc.calories<100)
 .sorted(Comparator.comparingInt(abc::getCalories).reversed()).collect(Collectors.toList());
   l.forEach(System.out::println);
   System.out.println("------------------");
   list.stream().forEach(abc-> System.out.println(abc.name+" "+abc.color));
   System.out.println("------------------");
  List<abc> l1 =list.stream().filter(abc->abc.color=="Red")
		   .sorted(Comparator.comparingInt(abc::getprice)).collect(Collectors.toList());
   l1.forEach(System.out::println);
	}

}
