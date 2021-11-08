import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
class transactions
{
	Trader trader;
	int year;
	int value;
	public transactions(Trader trader,int year,int value)
	{
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
	public Trader gettrader()
	{
		return trader;
	}
	public void settrader(Trader trader)
	{
		this.trader=trader;
	}
	public int getvalue()
	{
		return value;
	}
	public void settrader(int value)
	{
		this.value=value;
	}
	
	 @Override
	    public String toString() {
	        return "abc{" +
	                "value='" + value + '\'' +
	                ", year=" +year  +
	                '}';
	    }
	
}
class Trader
{
	String name ;
	String city;
	public Trader(String name,String city)
	{
		this.name=name;
		this.city=city;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
}
public class Transaction {

	public static void main(String[] args) {
       List<Trader> list= Arrays.asList(new Trader("t1","Mumbai"),new Trader("t2","pune"),
    		   new Trader("t3","delhi"));
       
       List<transactions> list1= Arrays.asList(new transactions(list.get(0),2011,2352),
    		   new transactions(list.get(1),2011,2332),new transactions(list.get(2),2017,2432));
       
       
       
       List<transactions> l=list1.stream().filter(transactions->transactions.year==2011)
    		   .sorted(Comparator.comparingInt(transactions::getvalue)).collect(Collectors.toList());
    		     l.forEach(System.out::println);
    		     System.out.println("------------------");
       

	}

}
